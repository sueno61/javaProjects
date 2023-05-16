package Lesson03;

public class EvenChar {

	public static void main(String[] args) {
		String str = args[0];

		for (int i = 1; i < str.length(); i=i+2) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");

	}

}
