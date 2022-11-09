import java.util.Set;
import java.util.HashSet;

class SetTest {
    public static void main(String[] args) {
        Set<String> winUser = new HashSet<String>();
        Set<String> macUser = new HashSet<String>();

        winUser.add("Sasaki");
        winUser.add("Harada");
        winUser.add("Doi");
        winUser.add("Sasaki");

        macUser.add("Asai");
        macUser.add("Sasaki");
        macUser.add("Mizuno");

        System.out.println("Windows User: " + winUser);
        System.out.println("Mac User: " + macUser);

        Set<String> winOrMacUser = new HashSet<String>(winUser);
        winOrMacUser.addAll(macUser);
        System.out.println("Windows or Mac User: " + winOrMacUser);

        Set<String> winAndMacUser = new HashSet<String>(winUser);
        winAndMacUser.retainAll(macUser);
        System.out.println("Windows or Mac User: " + winAndMacUser);

    }
}
