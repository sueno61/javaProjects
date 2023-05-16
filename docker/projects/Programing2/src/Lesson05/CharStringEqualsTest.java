package Lesson05;

public class CharStringEqualsTest {
    public static void main(String[] args) {
        // 「文字」(char)の比較
        char c1 = 'a';
        char c2 = 'a';
        char c3 = 'x';
        System.out.println("c1:" + c1 + "  c2:" + c2 + "  c3:" + c3);

        if (c1 == c2) {
            System.out.println("c1==c2はtrue");
        } else {
            System.out.println("c1==c2はfalse");
        }
        if (c1 == c3) {
            System.out.println("c1==c3はtrue");
        } else {
            System.out.println("c1==c3はfalse");
        }
        System.out.println();

        // 「文字列」(String)の比較
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("xyz");
        System.out.println("str1:" + str1 + "  str2:" + str2 + "  str3:" + str3);

        if (str1 == str2) {
            System.out.println("str1==str2はtrue");
        } else {
            System.out.println("str1==str2はfalse");
        }
        if (str1 == str3) {
            System.out.println("str1==str3はtrue");
        } else {
            System.out.println("str1==str3はfalse");
        }

        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2)はtrue");
        } else {
            System.out.println("str1.equals(str2)はfalse");
        }
        if (str1.equals(str3)) {
            System.out.println("str1.equals(str3)はtrue");
        } else {
            System.out.println("str1.equals(str3)はfalse");
        }

    }
}