package Lesson05;

public class StarArray {

	public static void main(String[] args) {

		char[][] star;
		star = new char[6][6];

		for (int i = 0; i < 6; i++) {
			int j = 0;
			while (j <= i) {
				star[i][j] = '★';
				j++;
			}
			while (j < 6) {
				star[i][j] = '☆';
				j++;
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}
}
