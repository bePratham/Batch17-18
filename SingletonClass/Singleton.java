package SingletonClass;

public class Singleton {
    private Singleton(){
        System.out.println("I am singleton construtor");
    }

    private static Singleton instance;

    public static Singleton getMySingletonInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
