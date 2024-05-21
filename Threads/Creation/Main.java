package Threads.Creation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        // counter1.CountMe();
        // counter2.CountMe();

        counter1.start();
        counter2.start();
        Thread.sleep(5100);

        long endTime =System.currentTimeMillis();
        System.out.println("Total time taken by my system :- "+(endTime-startTime));
 
    }
} 
// 10266

class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        try {
            CountMe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CountMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("Thread no : " + threadNo + " and iteration no : " + i);
        }
    }
}