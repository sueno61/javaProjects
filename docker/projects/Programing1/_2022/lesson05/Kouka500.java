public class Kouka500 {
    public static void main(String[] args) {
        System.out.println("金額を入力してください。");
        String line = System.console().readLine();
        int c = Integer.parseInt(line);
        System.out.println("小銭入れには500円硬貨が最大で " +(c/500)+ " 枚入っています。" );
    }
}