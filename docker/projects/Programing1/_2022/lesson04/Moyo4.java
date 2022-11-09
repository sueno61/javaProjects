public class Moyo4 {
    public static void main(String[] args) {
        String s = System.console().readLine("模様に使う文字列を入力してください。 ");
        System.out.println("「" + s + "」で作った山形の模様");

        System.out.println("　　　　" + s);
        System.out.println("　　　" + s + s + s);
        System.out.println("　　" + s + s + s + s + s);
        System.out.println("　" + s + s + s + s + s + s + s);
        System.out.println(s + s + s + s + s + s + s + s + s);
        
    }
}
