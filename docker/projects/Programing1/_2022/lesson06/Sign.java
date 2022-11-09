public class Sign {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

        if (n > 0) {
            System.out.println("n は正の数です。");
        }
        if (n == 0) {
            System.out.println("n は０です。");
        }
        if (n < 0) {
            System.out.println("n は負の数です。");
        }
    }
}
