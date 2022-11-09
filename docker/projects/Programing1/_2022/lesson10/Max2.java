public class Max2 {
    public static void main(String[] args) {
        String line;
        int input, max;

        System.out.println("--- 整数を5回入力 ---");

        // ひとつ目
        System.out.printf("%d回目: ",1);
        line = System.console().readLine();
        input = Integer.parseInt(line);
        max = input;
        // ふたつ目以降
        for (int i = 2; i <= 5; i++) {
            System.out.printf("%d回目: ",i);
            line = System.console().readLine();
            input = Integer.parseInt(line);
            if (input > max) {
                max = input;
            }   
        }

        System.out.println("最大値は" + max);
    }
}
