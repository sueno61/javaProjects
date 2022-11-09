public class Tuika5a {
    public static void main(String[] args){
        String line = System.console().readLine("n = ");
        int n = Integer.parseInt(line);

    // 以下は、べき乗値がinfinityになり、5000乗あたりから計算不可 
        // double d = Math.pow(2, n);
        // int k = (int)(Math.log10(d)+1);
        // System.out.println(d);

    // log2^10000 = 10000*log2
        int k = (int) (n * Math.log10(2)) + 1;

        System.out.printf("2 の %d 乗は10進表表記で %d 桁の整数\n", n, k);
    }
}
