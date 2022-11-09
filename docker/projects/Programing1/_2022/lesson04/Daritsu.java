public class Daritsu {
  public static void main(String[] args) {
    int dasuu, anda;
    String line = System.console().readLine("打数: ");
    dasuu = Integer.parseInt(line);
    line = System.console().readLine("安打数: ");
    anda = Integer.parseInt(line);

    System.out.println(dasuu + "打数" + anda + "安打で、打率" + 1.0*anda/dasuu + "です。");
  }
}