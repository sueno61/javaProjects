package day12;

public class CarA implements Car {
    @Override
    public void drive() {
        System.out.println("CarA Drive");
    }
    @Override
    public void stop() {
        System.out.println("CarA Stop");
    }
    @Override
    public void turn() {
        System.out.println("CarA Turn");
    }
}
