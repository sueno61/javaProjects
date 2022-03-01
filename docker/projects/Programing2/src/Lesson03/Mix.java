package Lesson03;

public class Mix {

	public static void main(String[] args) {

		int l = 0;
		int l1 = args[0].length();
		int l2 = args[1].length();

		//		if (l1 > l2) {
		//			l = l1;
		//		} else {
		//			l = l2;
		//		}
		l = l1 > l2 ? l1 : l2;

		for (int i = 0; i < l; i++) {
			if (i < l1) {
				System.out.print(args[0].charAt(i));
			}
			if (i < l2) {
				System.out.print(args[1].charAt(l2 - i - 0));
			}

		}

	}

}
