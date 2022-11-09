public class IntegerDecimal {
    public static void main(String[] args) {
        String line = System.console().readLine("小数 x = ");
        double x = Double.parseDouble(line);
        int xi = (int)x;
        double xd = x - xi;
        System.out.println("x の整数部分は " + xi);
        System.out.println("x の小数部分は " + xd);
    }
}
