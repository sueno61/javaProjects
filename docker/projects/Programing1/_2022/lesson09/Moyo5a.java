public class Moyo5a {
    public static void main(String[] args) {
        String line = System.console().readLine("三角形の横幅:");
        int n = Integer.parseInt(line);

        for (int i=1; i<=n; i++) {

            // 空白
            for (int j=0; j<(n-i); j++) {
                System.out.print(" ") ;
            }
            // @
            for (int j=0; j<i; j++) {
                System.out.print("@") ;
            }
            System.out.println("");
        }
        
    }
}
