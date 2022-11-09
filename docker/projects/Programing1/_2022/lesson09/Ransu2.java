public class Ransu2 {
    public static void main(String[] args) {
        String line;
        int n;
        line = System.console().readLine("乱数をいつく作りますか:");
        n = Integer.parseInt(line);
        for (int i=1; i<=n; i++ ) {
            System.out.println(i + "番目の乱数:" + (int)(Math.random()*10));
        }
        
    }
}
