public class CountBaisu {
    public static void main(String[] args) {
        String s;
        int n;
        int both = 0;
        int ether = 0;

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (n % 4 == 0 && n % 7 == 0) {
            both = both + 1;
        } else if (n % 4 == 0 || n % 7 == 0) {
            ether = ether + 1;
        }

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (n % 4 == 0 && n % 7 == 0) {
            both = both + 1;
        } else if (n % 4 == 0 || n % 7 == 0) {
            ether = ether + 1;
        }

        s = System.console().readLine();
        n = Integer.parseInt(s);
        if (n % 4 == 0 && n % 7 == 0) {
            both = both + 1;
        } else if (n % 4 == 0 || n % 7 == 0) {
            ether = ether + 1;
        }

        System.out.println("4と7の両方の倍数: " + both + "個");
        System.out.println("4と7の片方の倍数: " + ether + "個");
    }
}
