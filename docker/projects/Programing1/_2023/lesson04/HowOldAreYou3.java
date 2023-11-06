// import java.io.*;

public class HowOldAreYou3 {
    public static void main(String[] args) {
        String name = System.console().readLine("お名前: ");
        String s = System.console().readLine(name + "さんのご年齢: ");
        int age = Integer.parseInt(s);
        System.out.println(name + "さんはいま " + age + " 歳ですが、10年後は " + (age + 10) + " 歳ですね。");

    }
}
