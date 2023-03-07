// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1
import java.util.Arrays;
import java.util.Scanner;

public class Example002 {
    public static void main(String[] args) {
        System.out.print("Введите элементы массива: ");

        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }
}
