package SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj= Singleton.getMySingletonInstance();
        Singleton obj1= Singleton.getMySingletonInstance();
        Singleton obj2= Singleton.getMySingletonInstance();
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj1);
    }
}
