package Interface;

public class NewCar {
    private Engine engine;
    private Media player = new MediaPlayer();

    public NewCar(){
        engine = new PetrolEngine();
    }
    public NewCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
