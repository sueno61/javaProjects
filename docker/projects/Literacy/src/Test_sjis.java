public class Test_sjis {
    public static void main(String[] args) {
        System.out.println("6€2=" + (6 / 2));

        int anda = 15;
        int dasu = 40;
        double ritsu = (double)anda / dasu;
        System.out.println(ritsu);

        ritsu =anda/dasu*1.0;
        System.out.println(ritsu);

        if (dasu%2 == 0) System.out.println("‹ô”‚Å‚·"+dasu);
        else System.out.println("Šï”‚Å‚·");


    }
}
