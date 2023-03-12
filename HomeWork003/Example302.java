// Пусть дан произвольный список целых чисел,
// удалить из него чётные числа

package HomeWork003;

import java.io.IOException;
import java.util.ArrayList;

public class Example302 {
    public static void main(String[] args) throws IOException {
        int[] data = {1, 5, 6, 8, 11, 4, 3, 8, 15};

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) list.add(data[i]);
        System.out.println(list);

        System.out.println(deleteEvenNumbers(list));
    }

    static ArrayList deleteEvenNumbers (ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int n:list) {
            if (n % 2 != 0) result.add(n);
        }
        return result;
    }
}
