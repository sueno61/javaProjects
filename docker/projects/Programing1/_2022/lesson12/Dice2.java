public class Dice2 {
    public static void main(String[] args) {
        String s = System.console().readLine("サイコロを振る回数: ");
        int n = Integer.parseInt(s);
        int[] kaisu = new int[13];
        for (int i = 0; i < n; i++) {
            int m1 = (int)(Math.random()*6)+1;
            int m2 = (int)(Math.random()*6)+1;
            kaisu[(m1+m2)] = kaisu[(m1+m2)] +1;
        }
        for (int i = 2; i <= 12; i++) {
            int c = kaisu[i];
            double p = 1.0*c/n;
            System.out.println(i + "の目: " + c + " 回, 確率 " + p); 
        }
    }
}
