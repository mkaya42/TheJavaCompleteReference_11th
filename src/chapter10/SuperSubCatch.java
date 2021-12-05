package chapter10;

/*
 * This program contains an error
 *
 * A subclass must come before its super class in a series of catch statements
 * If not unreachable code will be created and
 * compile time error will result
 * */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic Exception Catch");
        }
        //This catch is never reached because ArithmeticException is subclass of Exception
        /*catch (ArithmeticException e){
            System.out.println("This is never reached");

        }*/
    }
}
