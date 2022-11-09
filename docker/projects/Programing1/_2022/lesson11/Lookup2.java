public class Lookup2 {
    public static void main(String[] args) {
        int[] ns = new int[args.length];
        for (int i=0; i<args.length; i++) {
            ns[i] = Integer.parseInt(args[i]);
        }

        String s = System.console().readLine("key = ");
        int n = Integer.parseInt(s);
        int cnt = 0;
        for (int i=0; i<args.length; i++) {
            if (ns[i]==n*2) {
                cnt++;
            }
        }

        if (cnt>0) {
            System.out.println("nの2倍のデータが存在します。");
        } else {
            System.out.println("nの2倍のデータは存在しません。");
        }
    }
}
