public class Even {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

        if (n % 2 == 0) {
            System.out.println("n は偶数です。");
        } else {
            System.out.println("n は奇数です。");
        }

    }
}
