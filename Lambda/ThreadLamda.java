package Lambda;

public class ThreadLamda {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello");

            }
        });
        thread.start();

        Thread thread2 = new Thread(()->System.out.println("hello"));
        thread2.start();
    }
}
