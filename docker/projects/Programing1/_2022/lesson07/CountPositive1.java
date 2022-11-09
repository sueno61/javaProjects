public class CountPositive1 {
    public static void main(String[] args) {
        int count = 0;
        String line;
        int n;

        line = System.console().readLine();
        n = Integer.parseInt(line);
        if (n > 0) count = count + 1;
        
        line = System.console().readLine();
        n = Integer.parseInt(line);
        if (n > 0) count = count + 1;
        
        line = System.console().readLine();
        n = Integer.parseInt(line);
        if (n > 0) count = count + 1;
        
        line = System.console().readLine();
        n = Integer.parseInt(line);
        if (n > 0) count = count + 1;
        
        line = System.console().readLine();
        n = Integer.parseInt(line);
        if (n > 0) count = count + 1;

        System.out.println("正の整数は " + count + " 個");
    }
}
