package Lesson5;

public class Judge {

    /**
     * 
     * @param player1
     * @param player2
     */
    public void startJanken(Player player1, Player player2) {

        System.out.println("＝＝＝じゃんけん開始！＝＝＝");
        // 3回勝負
        for (int cnt = 0; cnt < 3; cnt++) {

            System.out.println("【" + (cnt + 1) + "回戦め】");

            Player winner = JudgeJanken(player1, player2);

            if (winner != null) {
                System.out.println(winner.getName() + "が勝ちました");
                winner.notifyResult(true);
            } else {
                System.out.println(" ⇒ 引き分けです！");
            }
        }

        System.out.println("＝＝＝じゃんけん終了＝＝＝");

        Player finalWinner = judgeFinalWinner(player1, player2);

        System.out.print(player1.getWincount() + " 対 " + player2.getWincount() + "で");

        if (finalWinner != null) {
            System.out.println(finalWinner.getName() + "の勝ちです。");
        } else {
            System.out.println("引き分けです！");
        }
    }

    private Player JudgeJanken(Player player1, Player player2) {
        Player winner = null;

        int player1Hand = player1.showHand();
        int player2Hand = player2.showHand();

        printHand(player1Hand);
        System.out.print(" vs ");
        printHand(player2Hand);
        System.out.println("");

        // 判定
        if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORE)
                || (player1Hand == Player.SCISSORE && player2Hand == Player.PAPER)
                || (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {

            winner = player1;
        }

        else if ((player1Hand == Player.STONE && player2Hand == Player.PAPER)
                || (player1Hand == Player.SCISSORE && player2Hand == Player.STONE)
                || (player1Hand == Player.PAPER && player2Hand == Player.SCISSORE)) {

            winner = player2;
        } else {
            winner = null;
        }

        return winner;
    }

    private Player judgeFinalWinner(Player player1, Player player2) {
        Player winner = null;

        int player1WinCount = player1.getWincount();
        int player2WinCount = player2.getWincount();
        if (player1WinCount > player2WinCount) {
            winner = player1;
        } else if (player1WinCount < player2WinCount) {
            winner = player2;
        } else {
            winner = null;
        }

        return winner;

    }

    private void printHand(int hand) {
        switch (hand) {
            case Player.STONE:
                System.out.print("グー");
                break;
            case Player.SCISSORE:
                System.out.print("チョキ");
                break;
            case Player.PAPER:
                System.out.print("パー");
                break;

            default:
                break;
        }
    }
}
