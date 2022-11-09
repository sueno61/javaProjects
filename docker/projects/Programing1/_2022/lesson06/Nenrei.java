public class Nenrei {
  public static void main(String[] args) {
    System.out.print("何歳ですか？");
    String line = System.console().readLine();
    int age = Integer.parseInt(line);
    if (age < 6) {
      System.out.println("幼児ですね。");
    } else if (age <= 11) {
      System.out.println("小学生ですね。");
    } else if (age <= 14) {
      System.out.println("中学生ですね。");
    } else if (age <= 17) {
      System.out.println("高校生ですね。");
    } else {
      System.out.println("りっぱな大人ですね。");
      if (age == 20) {
        System.out.println("成人式には行きましたか？");
      }
    }
  }
}