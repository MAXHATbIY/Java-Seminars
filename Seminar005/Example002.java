// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package Seminar005;

import java.util.LinkedList;
import java.util.Map;

public class Example002 {
    public static Map<Character, Character> brocketsMap = Map.of(
        '(', ')',
        '[', ']',
        '{', '}',
        '<', '>'
);

public static void main(String[] args) {
    LinkedList<Character> linkedList = new LinkedList<>();
    String str = "(123)>< + [(123)]";
    for (char ch : str.toCharArray()) {
        if (brocketsMap.containsKey(ch)) {
            linkedList.push(ch);
        } else {
            if (brocketsMap.containsValue(ch)) {
                if (linkedList.isEmpty()){
                    System.out.println(false);
                    return;
                }
                Character openBracket = linkedList.pop();
                if (!brocketsMap.get(openBracket).equals(ch)) {
                    System.out.println(false);
                    return;
                }
            }
        }
    }
    System.out.println(linkedList.isEmpty());
}
}
