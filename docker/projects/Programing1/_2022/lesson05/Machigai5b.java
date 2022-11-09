public class Machigai5b {
    public static void main(String[] args) {
        // int ransu = (int) (Math.random()*6) + 1;
        
        int me1 = (int)(Math.random()*6) + 1;
        System.out.println("1番目のサイコロの目 = " + me1);
        
        int me2 = (int)(Math.random()*6) + 1;
        System.out.println("2番目のサイコロの目 = " + me2);

        System.out.println("二つのサイコロの目の合計 = " + (me1+me2));
    }
}