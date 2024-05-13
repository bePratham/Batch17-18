package OOPs.Encapsulation;

abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }
    public void message(){
        System.out.println("Hiiii Greetings");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        
    }
}
