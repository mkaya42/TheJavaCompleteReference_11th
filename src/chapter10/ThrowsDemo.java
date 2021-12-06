package chapter10;

//This program contains error , will not compile..
public class ThrowsDemo {
    static void throwOne() {
        System.out.println("Inside throw one ");
        //throw new IllegalAccessException("demo"); //gives error , unhandled exception
    }

    public static void main(String[] args) {

        throwOne();

    }
}
