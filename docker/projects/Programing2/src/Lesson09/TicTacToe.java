package Lesson09;

public class TicTacToe {

	boolean top = true;
	char board[][];

	public TicTacToe() {
		board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '　';
			}
		}
	}

	public TicTacToe(int x, int y) {
		board = new char[x][y];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '　';
			}
		}
	}

	public boolean isFirst() {
		// top = !top;
		return top;
	}

	public void turn() {
		top = !top;
	}

	public void setMark(int row, int col) {

		if (isFirst()) { // top
			board[row][col] = '○';
		} else {
			board[row][col] = '×';
		}
	}

	public boolean isEmpty(int row, int col) {
		if (board[row][col] == '　') {
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		int i, j;
		i = j = 0;

		for (char[] col : board) {
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
				for (int k = 0; k < (col.length); k++) {
					System.out.print("--");
					if (k != col.length - 1) {
						System.out.print("+");
					}
				}
				System.out.println();
			}
		}
	}

	public boolean isWinning() {
		// char mark = '○';
		// int cnt = 0;

		char[] marks = new char[board.length];

		/* よこ */
		for (int i = 0; i < board.length; i++) {
			if (chkMarks(board[i])) {
				return true;
			}
		}

		/* たて */
		for (int j = 0; j < board[1].length; j++) {

			for (int i = 0; i < board.length; i++) {
				marks[i] = board[i][j];
			}
			if (chkMarks(marks)) {
				return true;
			}
		}

		/* ななめ（右下がり） */
		for (int i = 0; i < board.length; i++) {
			marks[i] = board[i][i];
		}
		if (chkMarks(marks)) {
			return true;
		}

		/* ななめ（右下がり） */
		for (int i = 0; i < board.length; i++) {
			int j = board.length - i - 1;
			marks[i] = board[i][j];
		}
		if (chkMarks(marks)) {
			return true;
		}

		return false;
	}

	public boolean chkMarks(char[] marks) {
		int cnt = 0;
		char mark = '　';
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == '　')
				return false;

			if (i == 0) {
				mark = marks[i];
			}
			if (marks[i] == mark) {
				cnt++;
			}
		}
		if (cnt == marks.length) {
			return true;
		}

		return false;
	}

}
