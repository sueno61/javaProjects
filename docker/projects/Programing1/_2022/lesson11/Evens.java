public class Evens {
    public static void main(String[] args) {
        int n;
        System.out.print("偶数: ");
        for (int i = 0; i < args.length; i++) {
            n = Integer.parseInt(args[i]);
            if (n%2==0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");

    }
}
