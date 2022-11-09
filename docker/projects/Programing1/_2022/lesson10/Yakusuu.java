public class Yakusuu {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

        System.out.print("整数 n の約数は1");
        int count = 1;

        for (int i = 2; i <= n; i++) {
            if (n%i==0) {
                System.out.print("," + i);
                count++;
            }
        }
        System.out.println("です。");
        System.out.println("また、整数 n の約数は" + count +"個です。");
    }
}
