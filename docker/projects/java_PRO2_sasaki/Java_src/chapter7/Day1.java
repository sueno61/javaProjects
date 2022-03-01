import java.time.LocalDate;

class Day1 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today.getDayOfWeek());
  }
}
