// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернёет «перевёрнутый» список.

package HomeWork004;

import java.util.LinkedList;

public class Example001 {
    public static void main(String[] args) {
        String[] array = {"2", "33", "GB", "Hello"};
        LinkedList<String> array2 = new LinkedList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            array2.add(array[i]);
        }
        System.out.println(array2);
    }
}
