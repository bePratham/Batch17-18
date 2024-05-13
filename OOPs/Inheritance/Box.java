package OOPs.Inheritance;

public class Box {
    int l;
    int b,h;
    void message(){
        System.out.println("Hello I am Box");
    }
    Box(){
        System.out.println("I am in Default Constructor");
        l=1;
        b=1;
        h=1;
    }
    Box(int l,int b,int h){
        this.l=l;
        this.h=h;
        this.b=b;
    }
}
