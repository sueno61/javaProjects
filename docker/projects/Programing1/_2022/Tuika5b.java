public class Tuika5b {
    public static void main(String[] args){

        int c1, c2;

        c1=25299;
        c2=27542;
        charadd(c1, c2);
        
        c1=22826;
        c2=37070;
        charadd(c1, c2);

        c1=55362;
        c2=57271;
        charadd(c1, c2);
    }

    static void charadd(int c1, int c2) {
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1とc2を続けて表示すると「" + (char)c1 + (char)c2 + "」");

    }
}
