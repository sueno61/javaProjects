public class Saidai {
    public static void main(String[] args) {
        int max, n;
        String s;

        s = System.console().readLine("整数を入力: ");
        max = Integer.parseInt(s);
        s = System.console().readLine("整数を入力: ");
        n = Integer.parseInt(s);
        if (n > max) {
            max = n;
        }
        s = System.console().readLine("整数を入力: ");
        n = Integer.parseInt(s);
        if (n > max) {
            max = n;
        }
        s = System.console().readLine("整数を入力: ");
        n = Integer.parseInt(s);
        if (n > max) {
            max = n;
        }

        System.out.println("最大値: " + max);
    }
}
