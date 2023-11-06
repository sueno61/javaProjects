public class Average {
    public static void main(String[] args) {
        System.out.println("2つの数値を入力してください。");
        String line = System.console().readLine("x = ");
        int x = Integer.parseInt(line);
        double xx = Integer.parseInt(line);
        line = System.console().readLine("y = ");
        int y = Integer.parseInt(line);
        double yy = Integer.parseInt(line);
        System.out.println(x + " と " + y + " の相加平均は " + (x + y) / 2.0);
        System.out.println(x + " と " + y + " の相乗平均は " + Math.sqrt(x * y * 1.0));

        System.out.println((xx + yy) / 2);
        System.out.println(Math.sqrt(xx * yy));

        System.out.println(xx);

    }
}
