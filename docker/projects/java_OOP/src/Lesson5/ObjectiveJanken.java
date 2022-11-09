package Lesson5;

public class ObjectiveJanken {
    public static void main(String[] args) {
        Judge dreddo = new Judge();

        // プレイヤー１
        Player suzuki = new Player("鈴木さん");
        // 戦略の生成
//        Tactics suzukiTac = new RandomTactics();
        Tactics suzukiTac = new StoneOnlyTactics();
        suzuki.setTactics(suzukiTac);

        // プレイヤー２
        Player sato = new Player("佐藤さん");
        Tactics satoTac = new RandomTactics();
        sato.setTactics(satoTac);

        dreddo.startJanken(suzuki, sato);
    }
}
