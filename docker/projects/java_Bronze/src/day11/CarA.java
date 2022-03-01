package day11;

public class CarA extends Car {
    @Override
    public void drive() {
        System.out.println("CarA Runs");
    }

    @Override
    public void stop() {
        System.out.println("CarA Stops");
    }

    @Override
    public void turn() {
        System.out.println("CarA Turns");
    }

    public void aorg() {
        System.out.println("CarA original");
    }
}
