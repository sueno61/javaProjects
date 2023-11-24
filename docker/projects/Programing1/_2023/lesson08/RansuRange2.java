public class RansuRange2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int bias = (int) (Math.random() * 2) * 6 + 1;
            int r = (int) (Math.random() * 3) + bias;

            System.out.println(i + "回目: " + r);
        }

    }
}
