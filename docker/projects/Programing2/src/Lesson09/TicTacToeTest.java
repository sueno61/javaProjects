package Lesson09;

import java.util.Scanner;

public class TicTacToeTest {

	public static void main(String[] args) {

		int siz = 3;
		TicTacToe ttt = new TicTacToe(siz, siz);
		// TicTacToe ttt = new TicTacToe();

		ttt.show();
		System.out.println("Start!　先手入力");

		Scanner sin = new Scanner(System.in);

		int cnts = 0;
		boolean end = false;

		do {

			int row = sin.nextInt();
			int col = sin.nextInt();

			if (row < siz && col < siz) {

				// 空いている場所か
				if (ttt.isEmpty(row, col)) {

					ttt.setMark(row, col);
					cnts++;
					ttt.show();

					// 勝負有り？
					if (ttt.isWinning()) {
						if (ttt.isFirst()) {
							System.out.println("先手○の勝ち");
						} else {
							System.out.println("後手×の勝ち");
						}
						end = true;
						// まだ埋まっていない？
					} else if (cnts < siz * siz) {
						ttt.turn();

						if (ttt.isFirst()) {
							System.out.println("先手入力");
						} else {
							System.out.println("後手入力");
						}

					} else {
						System.out.println("盤がうまりました（引き分け）");
						end = true;
					}

				} else {
					System.out.println("そこは打てません。もう一度。");
				}

			} else {
				System.out.println("入力された場所は有りません。もう一度。");
			}
		} while (!end);

		sin.close();

	}

}
