package Lesson02;

public class Days {

	public static void main(String[] args) {

		int days = 31;

		for (String s : args) {
			int m = Integer.parseInt(s);

			switch (m) {
			case 2:
				days = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				days = 31;
				break;
			}

			System.out.println(m + "月は" + days + "日です。");
		}

	}
}
