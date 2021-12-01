package chapter8;
//A simple demonstration of abstract

/*There can be no objects of an abstract class. That is, an abstract class
cannot be directly instantiated with the new operator*/

abstract class A7 {
    abstract void callme();

    //concrete methods still allowed in abstract class
    void callmetoo() {
        System.out.println("This is a concrete method");
    }

}

class B7 extends A7 {

    void callme() {
        System.out.println("B's implementation of callme");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        B7 b=new B7();
        b.callme();
        b.callmetoo();

    }
}
