/*
 * 学生番号: G99999202x
 * プログラム名: Reverse 
 * プログラムの説明: 入力した数値列を逆順に表示 
 * 作成日: 2023  
 */

public class Reverse {
    public static void main(String[] args) {
        String s = System.console().readLine("データの個数: ");
        int n = Integer.parseInt(s);
        int[] num = new int[n];
        // 格納
        for (int i = 0; i < n; i++) {
            s = System.console().readLine();
            num[i] = Integer.parseInt(s);
        }
        // 逆順に表示
        for (int i = 0; i < n; i++) {
            System.out.print(num[n - i - 1] + " ");
        }
        System.out.println("");

    }
}
