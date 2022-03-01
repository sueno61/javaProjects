package Simple;

public class SimpleJanken {
    // じゃんけんの手
    public static final int STONE = 0;      // グー
    public static final int SCISSORE = 1;   // チョキ
    public static final int PAPER = 2;      // パー

    public static void main(String[] args) {

        System.out.println("＝＝＝じゃんけん開始！＝＝＝");

        double randomNum = 0;

        int player1WinCnt = 0;
        int player2WinCnt = 0;

        // 3回勝負
        for (int cnt=0; cnt<3; cnt++) {

            int cnts = cnt + 1;
            System.out.println("【" + cnts + "回戦め】");

            // Player 1
            int player1Hand = 0;

            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.print(" 1:グー vs ");
            } else if (randomNum < 2) {
                player1Hand = SCISSORE;
                System.out.print(" 1:チョキ vs ");
            } else {
                player1Hand = PAPER;
                System.out.print(" 1:パー vs ");
            }

            // Player 2
            int player2Hand = 0;

            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.println("2:グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORE;
                System.out.println("2:チョキ");
            } else {
                player2Hand = PAPER;
                System.out.println("2:パー");
            }

            // 判定
            if (   (player1Hand ==STONE    && player2Hand == SCISSORE)
                || (player1Hand ==SCISSORE && player2Hand == PAPER)
                || (player1Hand ==PAPER    && player2Hand == STONE) ) {

                    player1WinCnt++;
                    System.out.println(" ⇒ プレイヤー１が勝ちました");
                }

            else if (  (player1Hand ==STONE    && player2Hand == PAPER)
                    || (player1Hand ==SCISSORE && player2Hand == STONE)
                    || (player1Hand ==PAPER    && player2Hand == SCISSORE) ) {

                    player2WinCnt++;
                    System.out.println(" ⇒ プレイヤー２が勝ちました");
                }
            else {
                System.out.println(" ⇒ 引き分けです！");

            }

        }

        System.out.println("＝＝＝じゃんけん終了＝＝＝");

        if (player1WinCnt > player2WinCnt) {
            System.out.println(player1WinCnt + " 対 " + player2WinCnt + "でプレイヤー１の勝ちです");
        } else if (player1WinCnt < player2WinCnt) {
            System.out.println(player2WinCnt + " 対 " + player1WinCnt + "でプレイヤー２の勝ちです");
        } else {
            System.out.println(player1WinCnt + " 対 " + player2WinCnt + "の引き分けです！");
        }

    }


}
