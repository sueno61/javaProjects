public class Digtest {
    public static void main(String[] args){
        String line =System.console().readLine("n = ");
        int n =Integer.parseInt(line);
        String m2="" ;
        System.out.print("m = ");

        for (int x = 0; x < 10; x++) {
            int y =n/(int)(Math.pow(10,x));
            if (y!=0){
                y = y%10;
                System.out.print(y);
                m2 = m2 + y;
            }
        }
        int m =Integer.parseInt(m2);
        System.out.println("\nm*2="+(m*2));



    }
}