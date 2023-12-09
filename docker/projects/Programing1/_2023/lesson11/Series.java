/*
 * 学生番号: G99999202x
 * プログラム名: Series 
 * プログラムの説明: 連続して現れる整数を探す
 * 作成日: 2023  
 */

public class Series {
    public static void main(String[] args) {
        int[] n = new int[args.length];
        n[0] = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            n[i] = Integer.parseInt(args[i]);
            if (n[i - 1] == n[i]) {
                System.out.printf("%d番目と%d番目はともに%d\n", (i - 1), i, n[i]);
            }
        }
    }
}
