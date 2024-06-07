package Latch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        latch.await();
        System.out.println(Thread.currentThread().getName()+" thread got ended");
    }
}

class SomeThread extends Thread{
    CountDownLatch latch;
    public SomeThread(CountDownLatch latch){
        this.latch= latch;
    }
    @Override
    public void run(){
        System.out.println("Thread :- "+ Thread.currentThread().getName());
        latch.countDown();
    }
}