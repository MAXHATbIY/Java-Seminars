// Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork001;

import java.util.Scanner;

public class Example001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            sum +=i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        System.out.println("n! = " + factorial);
    }
}
