/*
 * 学生番号: G99999202x
 * プログラム名: Kouka3 
 * プログラムの説明: 手持ちの硬貨で指定された金額を支払うことができるか判定 
 * 作成日: 2023  
 */

public class Kouka3 {
    public static void main(String[] args) {
        int[] c = { 500, 100, 50, 10, 5, 1 };

        int[] mai = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            mai[i] = Integer.parseInt(args[i]);
            sum = sum + mai[i] * c[i];
        }

        String s = System.console().readLine("支払い金額: ");
        int pay = Integer.parseInt(s);

        if (sum < pay) {
            System.out.println("支払えない");
        } else {
            System.out.println("支払える");

            int n;
            int zan = pay;
            for (int i = 0; i < 6; i++) {
                n = zan / c[i];
                if (n <= mai[i]) {
                    zan = zan % c[i];
                } else {
                    zan = zan - c[i] * mai[i];
                }
            }
            if (zan > 0) {
                System.out.println("でも、お釣りなしでは支払えない");
            } else {
                System.out.println("また、お釣りなしでも支払い可能");
            }
        }
    }
}
