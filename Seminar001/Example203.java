// Напишите метод, который принимает на вход строку(String)
// и определяет является ли строка палиндромом(возвращает boolean значение).

class Example203 {
    public static void main(String[] args) {
        String slovo = "А роза упала на лапу азора";
        if(palindrom(slovo)) System.out.println("это слово палинндром");
        else System.out.println("это не палиндром");

    }
    public static boolean palindrom(String x){
        String palSpace = x.replace(" ", "").toLowerCase();

        char[] palSpaceCh = palSpace.toCharArray();

        for (int i = 0; i < palSpaceCh.length/2; i ++){
            if (palSpaceCh[i] != palSpaceCh[palSpaceCh.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
