package Generics;

public class Box <T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Value of bxo "+ intBox.getValue());
        Box<String> strBox = new Box<>();
        strBox.setValue("ashdsaiubs");
        // strBox.setValue(1);
    }
}
