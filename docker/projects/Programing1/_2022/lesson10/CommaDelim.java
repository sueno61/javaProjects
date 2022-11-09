public class CommaDelim {
    public static void main(String[] args) {
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

        for (int i=1; i<=n; i++) {
            if (i > 1) {
                System.out.print(",");
            } 
            System.out.print(i);
        }
        System.out.println("");

        
    }
}