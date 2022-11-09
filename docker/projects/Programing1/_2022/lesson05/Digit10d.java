public class Digit10d {
    public static void main(String[] args) {
        String s;
        int n, i, j, d;

        s = System.console().readLine("n = ");
        n = Integer.parseInt(s);
        s = System.console().readLine("i = ");
        i = Integer.parseInt(s);

        j = (int)(Math.pow(10, i-1));
        d = n / j;
        d = d % 10;

        System.out.println(n + " の " + i + " 桁目の数字は " + d);
    }
}
