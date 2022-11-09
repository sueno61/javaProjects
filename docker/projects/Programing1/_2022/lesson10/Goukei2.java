public class Goukei2 {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        System.out.printf("--- 整数を%d回入力 ---\n", n);

        int sum = 0;
        int input;
        for (int i = 0; i < n; i++) {
            line = System.console().readLine();
            input = Integer.parseInt(line);
            sum = sum + input;   
        }

        System.out.println("合計: " + sum);
    }
}
