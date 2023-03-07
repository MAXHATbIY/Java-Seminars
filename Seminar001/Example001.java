import java.time.LocalDateTime;

public class Example001 {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(LocalDateTime.now().getDayOfYear());
    }
}