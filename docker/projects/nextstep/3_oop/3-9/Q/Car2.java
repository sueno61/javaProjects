class Car2{
  int no;
  int speed;

  public Car2(){
    no = 0;
  }
  public Car2(int n){
    no = n;
  }
  public void run(int s){
    speed = s;
  }
  public void brake(){
    speed = 0;
  }
  public void brake(int s){
    speed = speed - s;
  }
  public void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
