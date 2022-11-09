import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ExceptionDemo3 {
  public static void main(String[] args) {
    Scanner sc = null;
    FileReader fr = null;
    try {
      fr = new FileReader("ExceptionDemo.java");
      sc = new Scanner(fr);
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    } catch (Exception e) {
      System.out.println("例外が発生しました");
    } catch (FileNotFoundException e) {
      System.out.println("ファイルが見つかりません");
    } finally {
      sc.close();
      try {
        fr.close();
      } catch (IOException e) {
        System.out.println("I/Oエラーが発生しました");
      }
    }
  }
}
