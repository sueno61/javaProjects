public class Reverse {
    public static void main(String[] args) {
        String s = System.console().readLine("データの個数: ");
        int n = Integer.parseInt(s);
        int[] num = new int[n];
        // 格納
        for (int i = 0; i < n; i++) {
            s = System.console().readLine();
            num[i] = Integer.parseInt(s);
        }
        // 逆順に表示 
        for (int i = 0; i < n; i++) {
            System.out.print(num[n-i-1] + " ");
        }
        System.out.println("");

    }
}
