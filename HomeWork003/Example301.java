// Реализовать алгоритм сортировки слиянием

package HomeWork003;

import java.util.Arrays;
import java.util.Random;

public class Example301 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    static int[] mergeSort(int[] array){
        if (array.length == 1) return array;

        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, arrayLeft.length);

        int[] arrayRight = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);

        arrayLeft = mergeSort(arrayLeft);
        arrayRight = mergeSort(arrayRight);

        return mergeArray(arrayLeft, arrayRight);
    }

    static int[] mergeArray(int[] array1, int[] array2){
        int[] result  = new int[array1.length + array2.length];
        int pos1 = 0; int pos2 = 0;
        for (int i = 0; i < array1.length + array2.length; i++) {
            if (pos1 == array1.length){
                result[i] = array2[pos2];
                pos2 += 1;
            }
            else if (pos2 == array2.length){
                result[i] = array1[pos1];
                pos1 += 1;
            }

            else if (array1[pos1] < array2[pos2]){
                result[i] = array1[pos1];
                pos1 += 1;
            }
            else {
                result[i] = array2[pos2];
                pos2 += 1;
            }
        }
        return result;
    }
}   
