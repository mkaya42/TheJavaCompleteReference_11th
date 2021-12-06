package chapter10;

//This is now correct
public class ThrowsDemo2 {

    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside the throw one");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
