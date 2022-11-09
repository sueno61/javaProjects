package Lesson10;

import java.util.Scanner;

public class MyBirthdayTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("年を入力");
		int nen = scan.nextInt();
		System.out.println("月日を入力");
		int gappi = scan.nextInt();

		System.out.print(nen + "-");
		System.out.printf("%04d", gappi);
		System.out.println();

		MyBirthday mb = new MyBirthday(nen, gappi);

		System.out.println(mb.toWareki());

		System.out.println("和暦表示：");
		System.out.println(mb.toString());

		scan.close();
	}

}
