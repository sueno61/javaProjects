public class Warikan3 {
    public static void main(String[] args) {
        String s = "";
        int p, n, w;

        s = System.console().readLine("支払金額：");
        p = Integer.parseInt(s);

        s = System.console().readLine("人数：");
        n = Integer.parseInt(s);

        if (p <= 0 || n <= 0) {
            System.out.println("支払金額および人数は、正の値にしてください。");

        } else {
            if (p % n == 0) {
                w = p / n;
            } else {
                w = p / n + 1;
            }

            System.out.println("一人当たり: " + w + "円");
            System.out.println("合計: " + w * n + "円");
            System.out.println("お釣り: " + (w * n - p) + "円");

        }
    }
}