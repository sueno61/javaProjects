public class Digit100d {
    public static void main(String[] args) {
        System.out.println("100 以上 1000 未満の整数 n を入力してください。");
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        if (n < 100 || 1000 <= n) {
            System.out.println("範囲外の整数です。");
        } else {

            int d100 = n /100;
            int m = n % 100;
            int d10 = m / 10;
            int d1 = m % 10;

            int ans = d1*100 + d10*10 + d100;
            System.out.println("n の各桁の数字を逆順に並べてできる整数は " + ans);
            int ans2 = ans * 2;
            System.out.println("また、その2倍は " + ans2);

        }
    }
}
