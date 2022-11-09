public class Quiz31 {
    public static void main(String[] args) {
        int x;
        System.out.println("整数を入力してください。");

        // ここで入力処理．整数に変換して x に代入する
        String line = System.console().readLine("x = ");
        x = Integer.parseInt(line);
        
        // 入力した x を表示
        System.out.println("最初の値：x = " + x);

        // x に 1 を加える
        x = x + 1;
        
        // 1 を加えた後の x の値を表示
        System.out.println("新しい値：x = " + x);
    }
}