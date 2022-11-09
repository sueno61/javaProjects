package day2;

import java.io.Console;

public class IfTest5 {
    public static void main(String[] args) {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine());

        if (10 < a) {
            System.out.println(a + "は？より大きい");
        }else{
            System.out.println(a + "は？以下");
        }

    }
    
}
