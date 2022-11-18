public class Eto {
  public static void main(String[] args) {
    String eto;
    String[] junishi = {"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};

    // 生まれた年を入力する。
    String s = System.console().readLine("生まれた年を西暦で入力してください: ");
    int year = Integer.parseInt(s);

    // 生まれた年の干支etoを配列junishiから見つける。
    int idx = (year%12 -4+12)%12;
    eto = junishi[idx];

    // 生まれた年の干支etoを表示
    System.out.println("あなたの干支は「"+eto+"」ですね。");
    
    // 2023年以降で干支がetoになる最初の年を計算して表示する。
    int yearB = 2023;
    int idxB = (yearB%12 -4+12)%12;
    int offset = (idx + 12 - idxB)%12;
    System.out.println("2023年以降の最初の"+eto+"年は、西暦" + (yearB+offset) + "年です。");

  }
}
