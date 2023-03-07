// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.

import java.util.Arrays;

public class Example003 {
    public static void main(String[] args) {
        int [] array = new int[] {3,2,2,3};
        System.out.println(Arrays.toString(array));

        int val = 3;
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length; j++) {
            if (array[j] == val){
                int buff = array[i];
                array[i] = array[j];
                array[j] = buff;
            }
           }
        }
        System.out.println(Arrays.toString(array));
    }
}
