/*
 * 学生番号: G99999202x
 * プログラム名: RandomArray 
 * プログラムの説明: 乱数列を生成した後、5以上の乱数を表示 
 * 作成日: 2023  
 */

public class RandomArray {
    public static void main(String[] args) {
        String s;
        int n;
        s = System.console().readLine("n = ");
        n = Integer.parseInt(s);
        int[] rand = new int[n];
        // 乱数生成
        System.out.print("生成した乱数: ");
        for (int i = 0; i < n; i++) {
            rand[i] = (int) (Math.random() * 10) + 1;
            System.out.print(rand[i] + " ");
        }
        System.out.println();

        // 5以上を判定
        System.out.print("5以上の乱数: ");
        for (int i = 0; i < n; i++) {
            if (rand[i] >= 5) {
                System.out.print(rand[i] + " ");
            }
        }
        System.out.println();
    }
}
