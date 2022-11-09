package day2;

import java.io.Console;

public class Switch {
    public static void main(String[] args) {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine());

        switch (a) {
        case 1:
            System.out.println("one");
            break;
        case 2:
        System.out.println("two");
        break;

        default:
        System.out.println("others");
        }


    }    
}
