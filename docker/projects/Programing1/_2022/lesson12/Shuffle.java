public class Shuffle {
    public static void main(String[] args) {
        int[] cards = {2,3,4,5,6,7,8,9,10,11,12,13, 1};  // start
        // シャッフル回数
        int cnt = (int)(Math.random()*100) + 100;

        for (int i = 0; i < cnt; i++) {
            int p1 = (int)(Math.random()*13);
            int p2 = (int)(Math.random()*13);
            int tmp = cards[p1];
            cards[p1] = cards[p2];
            cards[p2] = tmp;
        }

        for (int i = 0; i < 13; i++) {
            System.out.print(cards[i] + " "); 
        }
        System.out.println(""); 
        // System.out.println(cnt + " 回シャッフルしました。"); 
    }
}
