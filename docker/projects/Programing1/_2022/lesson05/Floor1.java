public class Floor1 {
    public static void main(String[] args) {
        String line = System.console().readLine("小数 x = ");
        double x = Double.parseDouble(line);
        int n = (int)(x*10);
        double ans = (double)n/10;
        System.out.println("x の小数第二位以下を切り捨てると " + ans);
    }
}
