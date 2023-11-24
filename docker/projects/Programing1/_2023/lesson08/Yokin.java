public class Yokin {
    public static void main(String[] args) {
        String s;
        int m, i;

        s = System.console().readLine("元金: ");
        m = Integer.parseInt(s);

        for (i = 1; i <= 2; i = i + 1) {
            System.out.println(i + "年後: " + (int) (Math.pow(1.05, i) * m) + "円");
        }

        System.out.println("...");

        i = 20;
        System.out.println(i + "年後: " + (int) (Math.pow(1.05, i) * m) + "円");
    }
}
