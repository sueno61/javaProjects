public class Language {
    public static void main(String[] args) {
        String lang1, lang2;
        lang1 = System.console().readLine("What programming language are you studying? ");
        lang2 = System.console().readLine("What is the next programming language you want to study? ");

        System.out.println("I'm studying \"" + lang1 + "\" now.");
        System.out.println("I want to study \"" + lang2 + "\" next.");
    }
}
