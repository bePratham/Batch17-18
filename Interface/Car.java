package Interface;

public class Car implements Engine, Media, Brake{

    @Override
    public void brake() {
        System.out.println("I applied brakes");
    }

    @Override
    public void start() {
        System.out.println("I start my car engine");
    }

    @Override
    public void acc() {
        System.out.println(" I am speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Stopping our engine");
    }
    
}
