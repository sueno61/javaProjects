public class Max5 {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int i=1; i<args.length; i=i+1) {
            int n = Integer.parseInt(args[i]);
            if (n > max) {
                max = n;
            }
        }
        System.out.println("max = " + max);
    }
}