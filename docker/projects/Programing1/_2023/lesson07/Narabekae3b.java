public class Narabekae3b {
    public static void main(String[] args) {
        String line = System.console().readLine("x = ");
        int x = Integer.parseInt(line);
        line = System.console().readLine("y = ");
        int y = Integer.parseInt(line);
        line = System.console().readLine("z = ");
        int z = Integer.parseInt(line);

        System.out.println("小さい順に並び替えます．同じ数は1回だけ表示します．");

        if (x <= y && x <= z) { // xが最小
            System.out.println(x);
            if (y <= z) { // x y z
                if (x < y) {
                    System.out.println(y);
                }
                if (y < z) {
                    System.out.println(z);
                }
            } else { // x z y
                if (x < z) {
                    System.out.println(z);
                }
                if (z < y) {
                    System.out.println(y);
                }
            }
        } else if (y <= x && y <= z) { // yが最小
            System.out.println(y);
            if (x <= z) { // y x z
                if (y < x) {
                    System.out.println(x);
                }
                if (x < z) {
                    System.out.println(z);
                }
            } else { // y z x
                if (y < z) {
                    System.out.println(z);
                }
                if (z < x) {
                    System.out.println(x);
                }
            }
        } else { // zが最小（のハズ）
            System.out.println(z);
            if (x <= y) { // z x y
                if (z < x) {
                    System.out.println(x);
                }
                if (x < y) {
                    System.out.println(y);
                }
            } else { // z y x
                if (z < y) {
                    System.out.println(y);
                }
                if (y < x) {
                    System.out.println(x);
                }
            }
        }
    }
}
