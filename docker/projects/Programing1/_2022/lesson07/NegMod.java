public class NegMod {
    public static void main(String[] args) {
        String line;
        int x, y, r;

        line = System.console().readLine("x = ");
        x = Integer.parseInt(line);
        line = System.console().readLine("y = ");
        y = Integer.parseInt(line);

        r = x % y;

        System.out.println("x ÷ y の余りは " + r);
        if (r < 0) {
            if (y > 0) {
                System.out.println("また、正の数の余りは " + (r+y));
            } else {
                System.out.println("また、正の数の余りは " + (r-y));
            }
        }

    }
}
