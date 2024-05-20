package Threads.Synchronization;

import static java.lang.Thread.sleep;

public class Synchronize {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime =System.currentTimeMillis();
        System.out.println("Total time taken by my system :- "+(endTime-startTime) + " ms");
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime =System.currentTimeMillis();
        System.out.println("Total time taken by my system :- "+(endTime-startTime) + " ms");
            }
        }).start();
    }
}
class Brackets{
    final private Object lock = "Lock";
      public void generate() throws InterruptedException{
        synchronized(lock){
            for (int i = 1; i <=20; i++) {
            if(i<=10)   System.out.print('[');
            else    System.out.print(']');
        }
    }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(10);
        }
    }
}
// 800 ms
// 1530 ms
// 800 ms