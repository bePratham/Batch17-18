package AnonamusThread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(6);
        SomeThread thread1 = new SomeThread("Thread1");
        SomeThread thread2 = new SomeThread("Thread2");
        SomeThread thread3 = new SomeThread("Thread3");
        SomeThread thread4 = new SomeThread("Thread4");
        SomeThread thread5 = new SomeThread("Threa15");
        SomeThread thread7 = new SomeThread("Thread6");
        SomeThread thread6 = new SomeThread("Thread7");
        SomeThread thread8 = new SomeThread("Threa18");
        SomeThread thread9 = new SomeThread("Thread9");
        SomeThread thread10 = new SomeThread("Thread10");
        SomeThread thread11 = new SomeThread("Thread11");
        SomeThread thread12 = new SomeThread("Thread12");
        SomeThread thread13 = new SomeThread("Thread13");

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);

        executorService.shutdown();
    }
}
class SomeThread extends Thread{
    private String name;
    public SomeThread(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void run(){
        Random random = new Random();
        System.out.println("Started thread : "+name);
        try {
            sleep(random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended thread : "+name);
    }
}