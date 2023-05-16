package Lesson04;

public class MultiplicationTable2D {

	public static void main(String[] args) {

		int M[][] = new int[9][9];
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				M[i - 1][j - 1] = i * j;
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.printf("%3d", M[i][j]);
			}
			System.out.println();
		}

	}

}
