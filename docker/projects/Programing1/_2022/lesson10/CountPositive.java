public class CountPositive {
    public static void main(String[] args) {
        String line;
        int input, count;
        System.out.println("--- 整数を5回入力 ---");
        count = 0;
        for (int i = 1; i <= 5; i++) {
            line = System.console().readLine(i +"回目: ");
            input = Integer.parseInt(line);
            if (input >= 1) {
                count++;
            }   
        }

        System.out.println("正の数が " + count + " 個ありました");
    }
}
