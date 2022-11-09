public class Bar5 {
    public static void main(String[] args) {
        String line = System.console().readLine("n=");
        int n = Integer.parseInt(line);
        for (int i=1; i<=n; i++) {
            if (i%5!=0) {
                System.out.print("-");
            } else {
                System.out.print("+");
            }
        }
        System.out.println(" " + n);      
    }
}
