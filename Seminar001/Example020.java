// Напишите метод который сжимает строку

public class Example020 {
    public static void main(String[] args) {
        String text = "aaaabbbcddd";
        char[] chatText = text.toCharArray();
        int count = 1;
        StringBuilder newText = new StringBuilder();
        for(int i = 0; i < text.length() - 1; i++){
            if(chatText[i] == chatText[i + 1]){
                count +=1;
            }else{
                
                newText.append(chatText[i] + String.valueOf(count));
                count = 1;
            }
        }
        newText.append(chatText[chatText.length - 1] + String.valueOf(count));
        System.out.println(newText);
    }
}
