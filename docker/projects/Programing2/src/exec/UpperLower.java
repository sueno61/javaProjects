package exec;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("英数字を入力してください");
		String str = scanner.next();
		scanner.close();
		// String str = "AbCdEfg";

		System.out.println("入力値: " + str);

		System.out.print("変換後: ");
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z') {
				c = (char) (c - 'A' + 'a');
			} else if ('a' <= c && c <= 'z') {
				c = (char) (c - 'a' + 'A');
			}
			System.out.print(c);
		}
		System.out.println();
	}
}