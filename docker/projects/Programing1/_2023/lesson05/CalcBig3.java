public class CalcBig3 {
    public static void main(String[] arrgs) {
        String input;
        long n, m;
        input = System.console().readLine("n = ");
        n = Long.parseLong(input);
        input = System.console().readLine("m = ");
        m = Long.parseLong(input);

        System.out.println(n + " * " + m + " = " + n * m);

    }
}
