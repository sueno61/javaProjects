public class Moyo5 {
    public static void main(String[] args) {
        String line = System.console().readLine("三角形の横幅:");
        int n = Integer.parseInt(line);

        for (int i = n; i > 0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*") ;
            }
            System.out.println("");
        }
        
    }
}
