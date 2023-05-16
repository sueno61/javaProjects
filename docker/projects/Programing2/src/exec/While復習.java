package exec;

public class While復習 {

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {
			System.out.print("No. ");
			System.out.println(i);
		}

		System.out.println("while");
		int i = 5;
		while (i > 0) {
			System.out.print("No. ");
			System.out.println(i);
			i--;
		}

		System.out.println("while否定演算子");
		i = 5;
		do {
			System.out.print("No. ");
			System.out.println(i);
			i--;

		} while (!(i <= 0));

	}
}
