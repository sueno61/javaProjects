public class CountRandomNumbers {
    public static void main(String[] args) {
        String line = System.console().readLine("乱数の個数:");
        int n = Integer.parseInt(line);

        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (Math.random() < 0.5) {
                cnt++;
            } 
        }
        System.out.println("0.5未満の乱数の個数: " + cnt);
        System.out.println("0.5未満の乱数の割合: " + (double)cnt/n);

    }
}
