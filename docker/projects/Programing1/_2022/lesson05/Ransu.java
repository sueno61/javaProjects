public class Ransu {
    public static void main(String[] args) {
        String line;
        int x, y;

        x = (int)(Math.random()*6) + 9;
        System.out.println("10〜15の間の乱数 x を1つ作りました。");
        System.out.println("x がいくつか予想してみてください。");
        line = System.console().readLine("予想 y を入力：");
        y = Integer.parseInt(line);
        System.out.println("乱数 x は " + x + " でした。");
        System.out.printf("x - y = %d\n", (x-y));

    }
}
