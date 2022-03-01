package exec;

public class EvenChar {

	public static void main(String[] args) {

		for (int i = 0; i < args[0].length(); i++) {
			if (i % 2 == 1) {
				System.out.print(args[0].charAt(i));
			}
		}
	}

}
