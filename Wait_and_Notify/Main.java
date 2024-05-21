package Wait_and_Notify;

import static java.lang.Thread.sleep;

public class Main {
    public static int balance =0;
    synchronized public void withdraw (int amount ) throws InterruptedException{
        if(balance <=0 ){
            System.out.println("Waiting for amount to be credit");
            wait();
        }
        balance = balance - amount;
        System.out.println("The current balance is "+balance);
    }
    public void deposit(int amount){
        synchronized(this){
        System.out.println("We are depositing the amount of $"+amount + " in our bank");
        balance = balance+amount;
        notifyAll();
    }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1=new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    main.withdraw(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }     
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                main.deposit(2000);
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
        
    }
}
