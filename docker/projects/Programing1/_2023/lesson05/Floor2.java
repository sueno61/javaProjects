public class Floor2 {
    public static void main(String[] args) {
        String input;
        int n, i;
        input = System.console().readLine("n = ");
        n = Integer.parseInt(input);
        input = System.console().readLine("i = ");
        i = Integer.parseInt(input);

        int d = (int) Math.pow(10, i);
        int ans = n / d * d;

        System.out.println(n + "の" + i + "桁目以下を切り捨てると" + ans);
    }
}
