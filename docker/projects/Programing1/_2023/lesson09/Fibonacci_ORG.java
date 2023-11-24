public class Fibonacci_ORG {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        String s = System.console().readLine("フィボナッチ数列の数：");
        int n = Integer.parseInt(s);
        if (n < 2) {
            System.out.println("表示するフィボナッチ数列の数は2より大きい数を入力してください");
        } else {
            System.out.println("フィボナッチ数列（最初の " + n + " 項）：");
            for (int i = 1; i <= n; i = i + 1) {
                if (i == 1) {
                    System.out.print(a + " ");
                } else if (i == 2) {
                    System.out.print(b + " ");
                } else {
                    int f = a + b;
                    System.out.print(f + " ");
                    a = b;
                    b = f;
                }
            }
            System.out.println();
        }
    }
}
