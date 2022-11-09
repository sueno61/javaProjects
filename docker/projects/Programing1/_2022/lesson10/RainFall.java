public class RainFall {
    public static void main(String[] args) {
        String line;
        double input;
        System.out.println("1週間の降水量を入力せよ");
        double max = 0;
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            line = System.console().readLine();
            input = Double.parseDouble(line);
            if (i == 0) {
                max = input;
            } else if (input > max) {
                max = input;
            }
            sum = sum + input;
        }
        System.out.println("平均降水量: " + (sum/7));
        System.out.println("最大降水量: " + max);
    }
}
