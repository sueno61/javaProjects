package day2;

public class ShortCircuit {
    public static void main(String[] args) {

        int a = 1;
        int i = 4;
        if (a == 1 | i++ < 5) {
            System.out.println("シングル|");
        }
        System.out.println(i);

        i = 4;
        if (a == 1 || i++ < 5) {
            System.out.println("ダブル||");
        }
        System.out.println(i);

    }    
}
