package chapter10;

//This program creates a custom exception type
public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("Called compute");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }

}
