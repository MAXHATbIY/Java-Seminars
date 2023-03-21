//1. Напишите метод, который заполнит массив из 1000 элементов
// случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив
// и с помощью Set вычислите процент уникальных значений в данном массиве
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 /
// общее количество чисел в массиве.

package Seminar006;

import java.util.*;

public class Example601 {
    public static void main(String[] args) {
        System.out.println(percentOfUnique(fillArray(1000)));
    }

    public static List<Integer> fillArray (int count) {
        ArrayList<Integer> result = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            result.add(rnd.nextInt(1, 24));
        }
        return result;
    }

    public static double percentOfUnique (List<Integer> list) {
        Set<Integer> integerSet = new HashSet<>(list);
        return integerSet.size() * 100.0 / list.size();
    }
}
