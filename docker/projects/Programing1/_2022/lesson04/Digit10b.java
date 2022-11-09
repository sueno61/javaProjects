public class Digit10b {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        n = n/10;
        n = n%10;
        System.out.println(line + " の 10 の位は " + n + " です。");
    }
}
