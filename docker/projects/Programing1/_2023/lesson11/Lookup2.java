/*
 * 学生番号: G99999202x
 * プログラム名: Lookup2 
 * プログラムの説明: 整数 n の2倍の値を探す 
 * 作成日: 2023  
 */

public class Lookup2 {
    public static void main(String[] args) {
        int[] nss = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nss[i] = Integer.parseInt(args[i]);
        }

        String s = System.console().readLine("key = ");
        int n = Integer.parseInt(s);
        int cnt = 0;
        for (int i = 0; i < args.length; i++) {
            if (nss[i] == n * 2) {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println("nの2倍のデータが存在します。");
        } else {
            System.out.println("nの2倍のデータは存在しません。");
        }
    }
}
