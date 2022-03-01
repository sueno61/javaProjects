class SquareTest2 {
  static long square(int n) {
    return n * n;
  }
  static double square(double n) {
    return n * n;
  }
  public static void main(String[] args) {
    System.out.println("2の2乗は" + square(2) + "です。");
    System.out.println("16.9の2乗は" + square(16.9) + "です。");
  }
}
