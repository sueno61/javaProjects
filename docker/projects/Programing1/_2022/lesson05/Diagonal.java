public class Diagonal {
    public static void main(String[] args) {
        String line;
        int w, h;
        line = System.console().readLine("長方形の幅: ");
        w = Integer.parseInt(line);
        line = System.console().readLine("長方形の高さ: ");
        h = Integer.parseInt(line);

        System.out.println("長方形の対角線の長さ = " + Math.sqrt(h*h+w*w));
    }
}
