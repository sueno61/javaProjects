public class Machigai4b {
    public static void main(String[] args) {
        System.out.println("整数を入力してください。");
        String seisu = System.console().readLine();

        int suu = Integer.parseInt(seisu);

        System.out.println(seisu + " から 10 を引くと " + (suu - 10) + " になります。");
    }
}