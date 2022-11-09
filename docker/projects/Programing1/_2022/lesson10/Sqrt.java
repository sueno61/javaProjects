public class Sqrt {
    public static void main(String[] args) {
        String line;
        int x, n, m;
        double r;
        line = System.console().readLine("x = ");
        x = Integer.parseInt(line);
        line = System.console().readLine("n = ");
        n = Integer.parseInt(line);

        m = 0;
        for (int i = 0; i < n; i++) {
            r = Math.random()*x;
            if (r*r < x) {
                m = m + 1;
            }
        }
        System.out.println(1.0*x*m/n);
    }
}
