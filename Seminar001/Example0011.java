import java.util.Scanner;

/*
 *Написать программу, которая запросит пользователя ввести <Имя>
 *в консоли.
 *Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>" 
 */

public class Example0011 {
    public static void main(String[] args) {
        
        // Метод через консоль
        // System.out.println("Введите имя: ");
        // String name = System.console().readLine();

        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        // System.out.print("Привет, " + name + "!"); второй вариант
        iScanner.close();
    }
}
