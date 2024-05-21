package Interrupt;

public class Main {
    public static int balance = 0;

    synchronized public void withdraw(int amount) throws InterruptedException {
        if (balance <= 0) {
            System.out.println("Waiting for amount to be credit");
            wait();
        }
        if ((balance - amount) < 0) {
            System.out.println("Low balance for withdraw");
            return;
        }
        balance = balance - amount;
        System.out.println("The current balance is " + balance);
    }

    public boolean deposit(int amount) {
        synchronized (this) {
            if (amount > 0) {
                System.out.println("We are depositing the amount of $" + amount + " in our bank");
                balance = balance + amount;
                notify();
                return true;
            }
            else{
                System.out.println("Invalid amount");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // try{
                //     Thread.sleep(2000);
                // }catch(InterruptedException e){
                //     e.printStackTrace();
                // }
                if(main.deposit(2200))   System.out.println("Transaction completed");
                else    Thread.interrupted();
            }
        });
        thread2.setName("Thread 2");
        thread2.start();

    }
}
