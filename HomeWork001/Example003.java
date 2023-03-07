// реализовать простой калькулятор

package HomeWork001;

import java.util.Scanner;

public class Example003 {
    public static void main(String[] args) {
        System.out.println("В калькуляторе есть следующие операции: \n" +
        "1. Сложение (+) \n" +
        "2. Вычитание (-) \n" +
        "3. Умножение (*) \n" + 
        "4. Деление (/) \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие: (+ или - или * или /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Проверка на ввод недопустимых действий

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Недопустимый оператор! Используйте: + или - или * или /");
        }

        // проверка на недопустимость операции

        if (operation == '/' && num2 == 0.0) {
            System.err.println("Второе число не может быть равным нулю в этой операции!");
        }

        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.err.println("Указан недопустимый оператор!");
        } 
    }
}
