package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc =new Scanner(System.in);
        // int i = sc.nextInt();
        // System.out.println(i);
        // sc.close();

        int a = 9,b=0;
        try{
            int c=divide(a,b);
        }catch(ArithmeticException err){
            System.out.println(err.getMessage());
        }
    }
    static int divide(int a,int b){
        if(b == 0 ) throw new ArithmeticException("Please don't divide it by 0");
        return a/b;
    }
}
