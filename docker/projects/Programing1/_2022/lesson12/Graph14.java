public class Graph14 {
    public static void main(String[] args) {
        String s = System.console().readLine("n = ");
        int n = Integer.parseInt(s);
        int[] ns = new int[n];
        int sum = 0;

        System.out.println(n + "個の整数を入力");
        for (int i = 0; i < n; i++) {
            s = System.console().readLine();
            ns[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < n; i++) {
            int cnt = ns[i]/5;
            sum = sum + ns[i];

            for (int j = 1; j <= cnt; j++) {
                if (j%10==0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println(" " + ns[i]);
        }
        System.out.println("平均: " + (double)sum / n);
        
    }
}
