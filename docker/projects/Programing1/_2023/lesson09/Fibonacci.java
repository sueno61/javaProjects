public class Fibonacci {
    public static void main(String[] args) {
        String s = System.console().readLine("フィボナッチ数列の数：");
        int n = Integer.parseInt(s);
        if (n <= 2) {
            System.out.println("表示するフィボナッチ数列の数は2より大きい数を入力してください");
        } else {
            System.out.println("フィボナッチ数列（最初の " + n + " 項）：");
            for (int i = 1; i <= n; i = i + 1) {
                System.out.print(FB(i) + " ");
            }
            System.out.println();
        }
    }

    public static int FB(int cnt) {
        if (cnt == 1)
            return 0;
        if (cnt == 2)
            return 1;

        return FB(cnt - 2) + FB(cnt - 1);
    }
}
