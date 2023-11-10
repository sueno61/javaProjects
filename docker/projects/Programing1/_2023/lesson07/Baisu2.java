public class Baisu2 {
    public static void main(String[] args) {
        String line = System.console().readLine("整数を入力してください: ");
        int n = Integer.parseInt(line);

        if (n % 2 == 0) {
            System.out.println("2の倍数です。");
        } else {
            System.out.println("2の倍数ではありません。");
        }
        if (n % 3 == 0) {
            System.out.println("3の倍数です。");
        } else {
            System.out.println("3の倍数ではありません。");
        }
        if (n % 7 == 0) {
            System.out.println("7の倍数です。");
        } else {
            System.out.println("7の倍数ではありません。");
        }
    }
}
