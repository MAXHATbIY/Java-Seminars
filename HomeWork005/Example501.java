//1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package HomeWork005;

import java.util.HashMap;
import java.util.List;

public class Example501 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
        findInPhoneBook("Жижин");
        findInPhoneBook("Мамонтов");
        findInPhoneBook("Кожуховский");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(000)000-00-00", "+7(111)111-11-11"));
        phoneBook.put("Мамонтов", List.of("+7(222)222-22-22", "+7(333)333-33-33"));
        phoneBook.put("Жижин", List.of("+7(444)444-44-44", "+7(555)555-55-55"));
        phoneBook.put("Кожуховский", List.of("+7(666)666-66-66", "+7(777)777-77-77"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s \n", surname, phoneBook.get(surname));
    }
}
