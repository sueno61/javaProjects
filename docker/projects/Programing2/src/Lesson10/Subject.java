package Lesson10;

import java.util.Random;

public class Subject {
    // private String subject;
    // private int score;
    // private char rank;
    String subject;
    int score;
    char rank;

    public Subject(String name) {
        this.subject = name;
        this.score = 0;
        this.rank = 'F';
    }

    public void takeExam() {
        Random rand = new Random();
        this.score = rand.nextInt(101);
    }

    public void getRank() {
        this.rank = rank(this.score);
    }

    public char rank(int score) {
        if (score < 60) {
            return 'D';
        } else if (score < 70) {
            return 'C';
        } else if (score < 80) {
            return 'B';
        } else if (score < 90) {
            return 'A';
        } else {
            return 'S';
        }
    }
}
