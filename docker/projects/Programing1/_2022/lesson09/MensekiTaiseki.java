public class MensekiTaiseki {
    public static void main(String[] args) {
        double s, v;
        double π = 3.14;

        for (int i=1; i<=9; i++) {
            s = i*i*π;
            v = 4*i*i*i*π/3;
            System.out.print("半径 " + i + " の円の面積は " + s + " で、");
            System.out.println("球の体積は " + v + " です。");
        }
    }
}
