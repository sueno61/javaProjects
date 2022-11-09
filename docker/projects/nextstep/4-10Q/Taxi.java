public class Taxi{
  private int crewNum;
  
  public Taxi(int crewNum){
    this.crewNum = crewNum;
  }
  void showCrewNum(){
    System.out.println("タクシーの乗客：" + crewNum + "名");
  }
}
