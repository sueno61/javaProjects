public class ToBinary {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);
        int base = 0;
        for (int i=30; i>=0; i--) {
            base = (int)Math.pow(2, i);
            if (n/base > 0) {
                n = n - base;
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println("");      
    }
}
