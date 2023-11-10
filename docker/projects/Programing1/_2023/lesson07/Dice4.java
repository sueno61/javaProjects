public class Dice4 {
    public static void main(String[] args) {
        int num;
        int count = 0;
        num = (int) (Math.random() * 6) + 1;
        System.out.println("サイコロの目: " + num);
        if (num >= 4) {
            count = count + 1;
        }
        num = (int) (Math.random() * 6) + 1;
        System.out.println("サイコロの目: " + num);
        if (num >= 4) {
            count = count + 1;
        }
        num = (int) (Math.random() * 6) + 1;
        System.out.println("サイコロの目: " + num);
        if (num >= 4) {
            count = count + 1;
        }

        System.out.println("4以上の目は " + count + " 回");
    }
}
