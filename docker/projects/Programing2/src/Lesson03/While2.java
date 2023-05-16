package Lesson03;

public class While2 {
	public static void main(String args[]) {

		// for (int i=5; i>0; i-- ) {
		// System.out.print("No. ");
		// System.out.println(i);
		// }

		int i = 5;
		while (!(i <= 0)) { // i>0
			System.out.print("No. ");
			System.out.println(i);
			i--;
		}
	}
}