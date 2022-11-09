public class Calc3 {
    public static void main(String[] args) {
        System.out.println("計算の順序によって、計算結果に違いが生じます。");
        System.out.print("1 + 2 * 3 - 4 / 2 = ");
        System.out.println(1 + 2 * 3 - 4 / 2);
        System.out.print("((1 + 2) * 3 - 4) / 2 = ");
        System.out.println(((1 + 2) * 3 - 4) / 2);
        System.out.println("特にかっこがないときに、どの順番に計算が行われるのか理解しましょう。");
    }
}
