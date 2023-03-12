// Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее из этого списка.

package HomeWork003;

import java.util.ArrayList;
import java.util.Random;

public class Example303 {
    public static void main(String[] args) {
        ArrayList<Integer> list02 = new ArrayList<>();
        for (int i = 0; i < 10; i++) list02.add(new Random().nextInt(20));
        System.out.println(list02);

        listNum(list02);
    }
    static void listNum(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        float average = 0;
        for (int n: list) {
            average = average + n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        average = average / list.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
