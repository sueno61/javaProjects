public class Quiz32 {
    public static void main(String[] args) {
        int x,y;
        String s;
        System.out.println("2つの数値を入力してください。");

        // ここで x と y を入力
        s = System.console().readLine("x = ");
        x = Integer.parseInt(s);
        s = System.console().readLine("y = ");
        y = Integer.parseInt(s);

        // 入力した x と y を表示
        System.out.println("入力した数値：");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("値を交換します。");

        // x と y の内容を入れ替える
        int tmp = x;
        x = y;
        y = tmp;

        // 入れ替え後の x と y を表示
        System.out.println("x = " + x + ", y = " + y);
    }
}