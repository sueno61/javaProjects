class PowerTest2 {
  static double power(double m, int n) {
    double ans = m;
    for (int i = 2; i <= n; i++) {
      ans = ans * m;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println("2.3の8乗は" + power(2.3, 8) + "です。");
    System.out.println("16.9の4乗は" + power(16.9, 4) + "です。");
  }
}
