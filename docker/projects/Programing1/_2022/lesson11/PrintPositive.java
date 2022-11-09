public class PrintPositive {
    public static void main(String[] args) {
        String s;
        int n;
        s = System.console().readLine("n = ");
        n = Integer.parseInt(s);
        int[] num = new int[n];
        // 格納
        for (int i = 0; i < n; i++) {
            s = System.console().readLine();
            num[i] = Integer.parseInt(s);
        }
        // 正の数を表示 
        System.out.print("正の整数: ");
        for (int i = 0; i < n; i++) {
            if (num[i]>0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println("");

    }
}
