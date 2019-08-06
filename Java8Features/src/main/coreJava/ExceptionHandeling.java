package main.coreJava;

public class ExceptionHandeling {
    static {
        Integer x = ExceptionHandeling.getX();
        Float y =90.0f;
    }
    static Integer getX(){return 10*2;}
    public static void main(String[] args) {
        try{
            // Your code here
        }catch (NumberFormatException | NullPointerException | IndexOutOfBoundsException | ArithmeticException ex)
        {
            System.out.println("Catching multiple type of the exceptions here");
        }

    }
}
