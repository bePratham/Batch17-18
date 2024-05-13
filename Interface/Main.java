package Interface;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.acc();
        // // car.brake();
        // Media carMedia = new Car();
        // carMedia.stop();
        NewCar car = new NewCar();
        
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.stopMusic();
    }
}
