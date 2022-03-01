public class Kasan {
    public static void main(String[] args) {
        int i, wa;

        wa = 0;
        System.out.print("和の計算 1〜100 : ");

        for (i=1; i<=100; i++) {
            wa += i;
        }
        System.out.println(wa);
    }
}