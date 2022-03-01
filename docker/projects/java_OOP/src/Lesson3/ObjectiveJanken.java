package Lesson3;

public class ObjectiveJanken {
    public static void main(String[] args) {
        Judge dreddo = new Judge();
        Player suzuki = new PlayerP("鈴木さん");
        Player sato = new PlayerG("佐藤さん");

        dreddo.startJanken(suzuki, sato);
    }
}
