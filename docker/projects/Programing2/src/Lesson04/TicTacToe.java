package Lesson04;

import java.util.Scanner;

public class TicTacToe {

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
				board[row][col] = '●';
			} else {
				board[row][col] = '○';
			}

			printBoard(board);

			top = !top;

			if (top) {
				System.out.println("先手入力");
			} else {
				System.out.println("後手入力");
			}

		}

		System.out.println("*** end ***");
		sin.close();

	}

}
