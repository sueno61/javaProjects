package Lesson05;

public class Cipher {
    public static void main(String[] args) {
        for (int i = 0; i < args[0].length(); i++) {
            System.out.print((char) (args[0].charAt(i) + 1));
        }

        System.out.println();
    }
}
