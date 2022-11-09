public class Digit10c {
    public static void main(String[] args) {
        int sum = 0;

        String line = System.console().readLine("n = ");
        int x = Integer.parseInt(line);

        sum = sum + x/100;
        x = x%100;
        sum = sum + x/10 + x%10;

        System.out.println(line + " の各桁の数字の合計は " + sum + " です。");
    }
}
