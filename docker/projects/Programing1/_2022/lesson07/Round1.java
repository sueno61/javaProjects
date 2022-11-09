public class Round1 {
    public static void main(String[] args) {
        String line = System.console().readLine("x = ");
        double x = Double.parseDouble(line);

        int n = (int)(x * 10);
        int r = n % 10;

        int ans = (int)x;
        if (r >= 5) {
            ans = ans + 1;
        }
        System.out.println(x + " を小数第一位で四捨五入すると " + ans);

    }
}
