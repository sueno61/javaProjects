/*
 * 学生番号: G99999202x
 * プログラム名: SecondMax.java 
 * プログラムの説明: 二番目に大きい整数 
 * 作成日: 2023/12/04  
 */

public class SecondMax {
    public static void main(String[] args) {
        String s;
        int max, second, n;
        boolean find = false;

        // 1つめ
        s = System.console().readLine();
        n = Integer.parseInt(s);
        max = n;
        second = 0;

        // 2つめから5つめ
        for (int i = 1; i < 5; i = i + 1) {
            s = System.console().readLine();
            n = Integer.parseInt(s);

            if (max < n) {
                second = max;
                find = true;
                max = n;
            } else if (second < n && n < max) {
                second = n;
                find = true;
            }
        }

        System.out.println("計算結果");
        if (find) {
            System.out.println(second);
        } else {
            System.out.println("最大の次に大きい数はありません");
        }
    }
}
