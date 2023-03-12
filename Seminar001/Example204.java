import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту
// строку в прстой текстовый файл, обработайте исключения.

public class Example204 {
    public static void main(String[] args) {
        StringBuilder slovo = new StringBuilder();
        String text = "test";
        slovo.append(text.repeat(100));

            try (FileWriter fw = new FileWriter("fileEx204.txt", false)) {
                for(int i = 0; i < 100; i++){
                    fw.write(text + '\n');
                }
                fw.write(slovo.toString());
                fw.flush();
                } catch (IOException ex) {
                System.out.println(ex.getMessage());
                }
               
    }
}
