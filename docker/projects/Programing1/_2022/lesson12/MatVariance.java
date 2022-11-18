public class MatVariance {
    public static void main(String[] args) {
        int n = args.length;
        double[] data = new double[n];
        int sum = 0;
        double se = 0;
        double mean = 0.0;
        double var = 0.0;
        double sigma = 0.0;

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(args[i]);
            data[i] = t;
            sum = sum + t;
        }
        // 平均
        mean = (double)sum / n;
        // 分散
        for (int i = 0; i < n; i++) {
            se = se + Math.pow(data[i]-mean, 2.0);
        }
        var = se / n;
        // 標準偏差
        sigma = Math.sqrt(var);

        System.out.println("平均: " + mean);
        System.out.println("分散: " + var);
        System.out.println("標準偏差: " + sigma);

    }
}
