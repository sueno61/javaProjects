import java.text.DecimalFormat;

class PackageTest2 {
  public static void main(String[] args) {
    int x = 1234567;

    DecimalFormat df = new DecimalFormat(",###");

    System.out.println("x = " + x);
    System.out.println("x = " + df.format(x));
  }
}
