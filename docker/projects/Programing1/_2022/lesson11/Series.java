public class Series {
    public static void main(String[] args) {
        int[] n = new int[args.length];
        n[0] = Integer.parseInt(args[0]);
        for (int i=1; i<args.length; i++) {
            n[i] = Integer.parseInt(args[i]);
            if (n[i-1]==n[i]) {
                System.out.printf("%d番目と%d番目はともに%d\n", (i-1), i, n[i]);
            }
        }
    }
}
