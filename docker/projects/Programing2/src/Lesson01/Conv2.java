package Lesson01;

public class Conv2 {
    public static void main(String[] args) {
        String str;
        char c;
        str = "ABC123";

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i); // strの0文字目（最初の文字)を変数cに代入

            if ('a' <= c && c <= 'z') {
                c = (char) ('A' + c - 'a');
            } else if ('A' <= c && c <= 'Z') {
                c = (char) ('a' + c - 'A');
            }

            System.out.print(c);
        }

        System.out.println("");
    }
}
