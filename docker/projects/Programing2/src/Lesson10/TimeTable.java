package Lesson10;

public class TimeTable {
    private int number;
    private String name;
    private Subject[][] classes = new Subject[5][5];

    public TimeTable(int k, String name) {
        this.number = k;
        this.name = name;
        Subject dummy = new Subject("P.H. ");
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {
                classes[i][j] = dummy;
            }
        }
    }

    public void regist(int w, int t, String s) {
        this.classes[t][w] = new Subject(s);
    }

    public void exam() {
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {
                if (classes[i][j].subject != "P.H. ") {
                    classes[i][j].takeExam();
                    classes[i][j].getRank();
                }
            }
        }
    }

    public int countCredits() {
        int credit = 0;
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {
                if (classes[i][j].rank != 'D' && classes[i][j].rank != 'F') {
                    credit++;
                }
            }
        }
        return credit;
    }

    public void show() {
        System.out.println("学生番号：" + this.number);
        System.out.println("氏　名　：" + this.name);

        for (int i = 0; i < classes.length; i++) {
            System.out.print((i + 1) + "限: ");
            for (int j = 0; j < classes[i].length; j++) {
                System.out.print(classes[i][j].subject);
            }
            System.out.println();

            System.out.print("     ");
            for (int j = 0; j < classes[i].length; j++) {
                System.out.print(classes[i][j].rank + "    ");
            }
            System.out.println();
        }

        System.out.println("単位数　：" + countCredits());

    }
}
