package Lesson10;

public class TimeTableTest {
    public static void main(String[] args) {

        TimeTable myTT = new TimeTable(7187, "Ueno");
        myTT.regist(1, 3, "PRO2 ");
        myTT.regist(1, 4, "PRO2 ");
        myTT.regist(0, 2, "LITR ");
        myTT.regist(0, 3, "LITR ");
        myTT.show();

        myTT.exam();

        System.out.println(myTT.countCredits());
        myTT.show();

    }
}
