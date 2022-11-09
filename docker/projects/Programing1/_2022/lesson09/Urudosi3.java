public class Urudosi3 {
    public static void main(String[] args) {

        for (int y = 1980; y <= 2180; y = y + 4) {
            if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
                System.out.println(y);
            }
        }
    }
}
