package Threads.Creation;

import static java.lang.Thread.sleep;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new MyCounter(1));
        Thread t2 = new Thread(new MyCounter(2));
        Thread t3 = new Thread(new MyCounter(3));
        Thread t4 = new Thread(new MyCounter(4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        sleep(5200);
        long endTime =System.currentTimeMillis();
        System.out.println("Total time taken by my system :- "+(endTime-startTime) + " ms");
    }
}
// 5220

class MyCounter implements Runnable {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread no : " + threadNo + " and iteration no : " + i);
        }
    }
}