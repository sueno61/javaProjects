public class Warikan2 {
    public static void main(String[] args) {
        String s = System.console().readLine("支払金額：");
        int p = Integer.parseInt(s);

        s = System.console().readLine("人数：");
        int n = Integer.parseInt(s);

        System.out.println("整数割り：" + p / n + "円");
        System.out.println("小数割り：" + 1.0 * p / n + "円");
    }
}