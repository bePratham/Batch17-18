public class First{
    public static void main(String[] args) {

        System.out.println("For loop starts here :- ");
        for (int i = 0; i < 6; i++) {
            if(i%2 == 0)
            System.out.println(i + " is even");
            else if(i==5)
                System.out.println("Five");
            else 
                System.out.println("Odd but not 5");
            // if(i%2 != 0)
            //     System.out.println(i+" is odd");
        }

        System.out.println();
        // int i=0;
        // System.out.println("While loop starts here :- ");
        // while(i<6){
        //     System.out.print(i);
        //     i++;
        // }
        // i=0;
        // // i=7;
        // System.out.println("do-while loop starts here :- ");
        // do{
        //     System.out.print(i);
        //     i++;
        // }while( i <6);
    }
}
