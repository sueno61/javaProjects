/*
 * 学生番号: G99999202x
 * プログラム名: Evens 
 * プログラムの説明: int型の配列nsの要素の偶数を列挙
 * 作成日: 2023  
 */

public class Evens {
    public static void main(String[] args) {
        int n;
        System.out.print("偶数: ");
        for (int i = 0; i < args.length; i++) {
            n = Integer.parseInt(args[i]);
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");

    }
}
