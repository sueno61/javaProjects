public class RansuRange {
    public static void main(String[] args) {
        String input;
        int min, max;
        input = System.console().readLine("最小値 = ");
        min = Integer.parseInt(input);
        input = System.console().readLine("最大値 = ");
        max = Integer.parseInt(input);

        System.out.println(min + "〜" + max + "の間の乱数 x を1つ作ります。");

        int r = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("乱数 x は " + r + " でした。");
    }
}
