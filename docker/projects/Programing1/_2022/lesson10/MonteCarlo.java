public class MonteCarlo {
    public static void main(String[] args) {
        String line = System.console().readLine("ダーツの本数: ");
        int n = Integer.parseInt(line);
        int count = 0;
        for (int i=0; i<n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x*x+y*y, 0.5) < 1) {
                count++;
            }
        }
        double p = (double)count/n;
        double p4 = p*4;
        System.out.printf("-- ダーツを%d本投げた結果 ---\n", n);
        System.out.println("アタリ: " + count + "本");
        System.out.println("アタリの確率: " + p);
        System.out.println("アタリの確率の4倍: " + p4);
    }
}
