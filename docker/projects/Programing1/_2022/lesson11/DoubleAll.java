public class DoubleAll {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++ ) {
            int n = Integer.parseInt(args[i]);
            System.out.printf("%d×2=%d\n", n, n*2);
        }
    }
}
