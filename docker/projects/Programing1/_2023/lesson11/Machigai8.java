/*
 * 学生番号: G99999202x
 * プログラム名: Machigai8 
 * プログラムの説明: 数の合計 
 * 作成日: 2023  
 */

public class Machigai8 {
  public static void main(String[] args) {
    double[] data;
    data = new double[6];
    data[0] = 3.1;
    data[1] = 4.1;
    data[2] = 5.9;
    data[3] = 2.6;
    data[4] = 5.3;
    data[5] = 9.7;
    double sum = 0.0;
    for (int i = 0; i < data.length; i = i + 1) {
      sum = sum + data[i];
    }
    System.out.println("sum = " + sum);
  }
}