package Interface;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("PetrolEngine is started");
    }

    @Override
    public void acc() {
       System.out.println("Boosting up our egine");
    }

    @Override
    public void stop() {
       System.out.println("DisEngage our PEgine");
    }
    
}
