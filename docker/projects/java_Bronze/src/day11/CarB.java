package day11;

public class CarB extends Car {

    @Override
    public void drive() {
        System.out.println("CarB Runs");
    }

    @Override
    public void stop() {
        System.out.println("CarB Stops");
    }

    @Override
    public void turn() {
        System.out.println("CarB Turns");
    }
    
}
