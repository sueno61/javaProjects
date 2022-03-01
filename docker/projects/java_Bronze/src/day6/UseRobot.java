package day6;

public class UseRobot {
    public static void main(String[] args) {
        Robot robo = new Robot();
        robo.setName("Java Robot");

        robo.setLight(new LedLight());
        // LedLight light = new LedLight();
        // robo.setLight(light);

        robo.sayHelo();
    }
    
}
