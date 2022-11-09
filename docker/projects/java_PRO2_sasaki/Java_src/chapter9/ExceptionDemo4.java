import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ExceptionDemo4 {
  public static void main(String[] args) {
    try {
      showList();
    } catch (FileNotFoundException e) {
      System.out.println("ファイルが見つかりません");
    } catch (IOException e) {
      System.out.println("I/Oエラーが発生しました");
    }
  }

  static void showList() throws FileNotFoundException, IOException {
    FileReader fr = new FileReader("ExceptionDemo4.java");
    Scanner sc =  new Scanner(fr);
    while (sc.hasNext()) {
      System.out.println(sc.nextLine());
    }
    sc.close();
    fr.close();
  }
}
