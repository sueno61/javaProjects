public class Machigai12 {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i=i+1) {
            int n = Integer.parseInt(args[i]);
            System.out.println(args[i] + " の2乗 = " + n*n);
        }
    }
}