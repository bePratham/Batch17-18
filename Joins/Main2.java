package Joins;

public class Main2 {
    public static int counter1 = 0;
    public static int counter2 = 0;
    
    public static void main(String[] args) throws InterruptedException {
        Thread th1= new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++)
                counter1++;
            }
        });
        th1.start();
        Thread th2= new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++)
                counter2++;
            }
        });
        th2.start();
        Thread th3= new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    th1.join();
                    th2.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        th3.join();
        System.out.println("Main Thread "+Thread.currentThread().getName());
        System.out.println("Counter : "+counter1);
        System.out.println("Counter : "+counter2);
    }
}
