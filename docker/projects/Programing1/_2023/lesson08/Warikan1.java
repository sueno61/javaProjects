public class Warikan1 {
    public static void main(String[] args) {
        String s = System.console().readLine("注文金額：");
        int p = Integer.parseInt(s);
        if (p < 1000) {
            System.out.println("(割引きなし)支払金額: " + p + "円");
        } else if (p < 2000) {
            System.out.println("(1割引き)支払金額: " + p * 9 / 10 + "円");
        } else {
            System.out.println("(2割引き)支払金額: " + p * 8 / 10 + "円");
        }
    }
}