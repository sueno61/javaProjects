import java.io.File;

public class ShowPWD {

    public static void main(String[] args) {

        // String path = System.getProperty("user.dir");
        // System.out.println("Dir: " + path);

        String path = new File("dummy.tmp").getAbsoluteFile().getParent();
        System.out.println(path);
    }

}
