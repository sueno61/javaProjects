package day12;

public class UsePolymorphism {
    public static void main(String[] args) {
        // Car car = new CarA();
        Car create = CarFactory.create();
        Car car = create;
        car.drive();
        car.turn();
        car.stop();

        // car.aorg();
    }    
}
