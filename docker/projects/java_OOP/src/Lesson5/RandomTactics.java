package Lesson5;

public class RandomTactics implements Tactics {

    public int readTactics() {
        int hand = 0;

        double randomNum = Math.random() * 3;
        if (randomNum < 1) {
            hand = Player.STONE;
        } else if (randomNum < 2) {
            hand = Player.SCISSORE;
        } else {
            hand = Player.PAPER;
        }

        return hand;    
    }
    
}
