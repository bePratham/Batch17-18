package Exception;

public class CustomExceptionExample {
    public void someMethod(int b) throws CustomException{
        if(b==0){
            throw new CustomException("This is a custom exception message");
        }
    }
    public static void main(String[] args) {
        CustomExceptionExample ex = new CustomExceptionExample();
        try{
            ex.someMethod(0);
        }catch(CustomException e){
            System.err.println("Custom exception caught : "+ e.getMessage());
        }
    }
}
