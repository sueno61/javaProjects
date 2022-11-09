public class Twice {
    public static void main(String[] args) {
        String s;
        int n, n2;
        System.out.println("整数を入力してください。");

        s = System.console().readLine();
        n = Integer.parseInt(s);
        n2 = n * 2;
        System.out.println(n + " を 2 倍すると " + n2 + " になります。");

    }
}
