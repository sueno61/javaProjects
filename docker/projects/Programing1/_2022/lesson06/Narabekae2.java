public class Narabekae2 {
    public static void main(String[] args) {
        System.out.println("2つの整数を入力してください。");
        String line = System.console().readLine();
        int x = Integer.parseInt(line);
        line = System.console().readLine();
        int y = Integer.parseInt(line);

        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        System.out.printf("小さい順に並べると %d, %d になります。\n", x, y);

    }
}
