public class Calc5 {
    public static void main(String[] args) {
        String line;
        int x, y;
        System.out.println("整数を2つ入力してください。");
        line = System.console().readLine();
        x = Integer.parseInt(line);
        line = System.console().readLine();
        y = Integer.parseInt(line);

        System.out.printf("%d + %d = %d\n", x, y, (x+y));
        System.out.printf("%d - %d = %d\n", x, y, (x-y));
        System.out.printf("%d × %d = %d\n", x, y, (x*y));
        System.out.printf("%d ÷ %d = %d ... %d\n", x, y, (x/y), (x%y));
        System.out.printf("%d / %d = ", x, y);
        System.out.println((double)x/y);

    }
}