import java.time.LocalDate;

class Day2 {
    public static void main(String[] args) {
        String days[] = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        LocalDate today = LocalDate.now();
        int n = today.getDayOfWeek().getValue();
        System.out.println(days[n-1]);
    }
}
