package Threads.Synchronization;

public class Brackets {
    public static void main(String[] args) {
        Createbrackets brackets= new Createbrackets();
        new Thread(new Runnable(){

            @Override
            public void run() {
            for(int i=0;i<10;i++){
                brackets.generate();
            }   
            }

        }).start();
    }
}
class Createbrackets{
    public void generate(){
        for(int i=1;i<=20;i++)
        {
            if(i<=10) System.out.print('[');
            else System.out.print(']');
        }
        System.out.println();
    } 
}