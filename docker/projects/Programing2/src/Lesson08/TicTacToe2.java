package Lesson08;

import java.util.Scanner;

public class TicTacToe2 {

	/* 盤面表示 */
	public static void printBoard(char[][] data) {
		int i, j;
		i = j = 0;

		/* 通常のfor文で書いた方が綺麗だけれど、拡張for文の動作確認のために */
		for (char[] col : data) {
			for (char row : col) {
				System.out.print(row);
				if (j != col.length - 1) {
					System.out.print('|');
				} else {
					System.out.println();
				}
				j++;
			}
			i++;
			j = 0;
			if (i != col.length) {
				System.out.println("--+--+--");
			}
		}
	}

	/* 勝敗判定 */
	public static boolean isWinning(char[][] d) {
		char mark = '○';
		int cnt = 0;
		/* よこ */
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				if (j == 0) {
					mark = d[i][j];
					cnt = 0;
				}
				if (d[i][j] != '　' && d[i][j] == mark) {
					cnt++;
				}
			}

			if (cnt == d[i].length) {
				return true;
			}
		}

		/* たて */
		for (int j = 0; j < d[1].length; j++) {
			for (int i = 0; i < d.length; i++) {
				if (i == 0) {
					mark = d[i][j];
					cnt = 0;
				}
				if (d[i][j] != '　' && d[i][j] == mark) {
					cnt++;
				}
			}

			if (cnt == d.length) {
				return true;
			}
		}

		/* ななめ（右下がり） */
		for (int i = 0; i < d.length; i++) {
			if (i == 0) {
				mark = d[i][i];
				cnt = 0;
			}
			if (d[i][i] != '　' && d[i][i] == mark) {
				cnt++;
			}
		}
		if (cnt == d.length) {
			return true;
		}

		/* ななめ（右下がり） */
		for (int i = 0; i < d.length; i++) {

			int j = d.length - i - 1;

			if (i == 0) {
				mark = d[i][j];
				cnt = 0;
			}
			if (d[i][j] != '　' && d[i][j] == mark) {
				cnt++;
			}
		}
		if (cnt == d.length) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		char board[][] = {
				{ '　', '　', '　' },
				{ '　', '　', '　' },
				{ '　', '　', '　' }
		};

		printBoard(board);
		System.out.println("Start!　先手入力");

		Scanner sin = new Scanner(System.in);

		boolean top = true;

		for (int i = 0; i < 9; i++) {

			int row = sin.nextInt();
			int col = sin.nextInt();

			if (top) {
				board[row][col] = '○';
			} else {
				board[row][col] = '×';
			}

			printBoard(board);

			if (isWinning(board)) {
				if (top) {
					System.out.println("先手○の勝ち");
				} else {
					System.out.println("後手×の勝ち");
				}
				break;
			}

			top = !top;

			if (top) {
				System.out.println("先手入力");
			} else {
				System.out.println("後手入力");
			}

		}

		System.out.println("終了");
		sin.close();

	}

}
