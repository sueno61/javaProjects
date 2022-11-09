package day6;

public class LedLight {

    public LedLight() {
        System.out.println("LedLightコントラクタ");
    }

    private int status = 0;
    
    public void lightUp() {
        if (status == 0) {
            status = 1;
            System.out.println("Light On!");
        }
    }

    public void lightDown() {
        if (status == 1) {
            status = 0;
            System.out.println("Light off!");
        }
    }


}
