public class Destructors {
    private int width,height;
    public Destructors(int w,int h){
        width=w;
        height=h;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Destructor called");
        super.finalize();
    }

    public void displayArea(){
        System.out.println("Area : "+(width * height));
    }
    public static void main(String[] args) {
        Destructors rectangle = new Destructors(5, 10);
        rectangle.displayArea();

        rectangle= null;
        System.gc();
    }
}
