// Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса,
//например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет

package HomeWork001;

public class Example004 {
    public static void main(String[] args) {
        // int count = 0;
        // for (int i = 0; i < 10; i++){
        //     for (int j = 0; j < 10; j++){
        //         if (20 + i + j * 10 + 5 == 69){
        //             count += 1;
        //             System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
        //         }
        //     }
        // }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if((i * 10 + j) + (k * 10 + l) == (m * 10 + n)){
                                    int q = i * 10 + j;
                                    int w = k * 10 + l;
                                    int e = m * 10 + n;
                                    System.out.printf("%d + %d = %d   ", q, w, e);
                                }
                            }
                        }
                    }
                }
            }
        }
        // System.out.println("\n");
        // if (count == 0) {
        //     System.out.println("Решений нет");
        // }
    }
}
