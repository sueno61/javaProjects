package day2;

public class IfTest2 {
    public static void main(String[] args) {
        
        if (true) {
            System.out.println("True!");
        }

        // if (false) {
        //     System.out.println("False!");
        // }

        int a = 10;
        int b = 20;
        boolean result = a < b;
        System.out.println(a + " < " + b + " ? : " + result);

        if (10 < b) {
            System.out.println("bは10より大きい");
        }

    }
    
}
