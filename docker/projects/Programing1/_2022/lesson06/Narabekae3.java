public class Narabekae3 {
    public static void main(String[] args) {
        System.out.println("3つの整数を入力してください。");
        String line = System.console().readLine();
        int x = Integer.parseInt(line);
        line = System.console().readLine();
        int y = Integer.parseInt(line);
        line = System.console().readLine();
        int z = Integer.parseInt(line);

        if (x <= y && x <= z) { // xが最小
            if (y <= z) {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", x, y, z);
            } else {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", x, z, y);
            }
        } else if (y <= x && y <= z) { // yが最小
            if (x <= z) {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", y, x, z);
            } else {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", y, z, x);
            }
        } else { // zが最小（のハズ）
            if (x <= y) {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", z, x, y);
            } else {
                System.out.printf("小さい順に並べ替えると %d, %d, %d になります。\n", z, y, x);
            }

        }

    }
}
