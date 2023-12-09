/*
 * 学生番号: G99999202x
 * プログラム名: DoubleAll 
 * プログラムの説明: 引数を読み取って、すべて2倍する 
 * 作成日: 2023  
 */

public class DoubleAll {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            System.out.printf("%d×2=%d\n", n, n * 2);
        }
    }
}
