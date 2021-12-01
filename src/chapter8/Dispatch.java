package chapter8;

//Dynamic method dispatch
class A6 {
    void callme() {
        System.out.println("Inside A's call me method");
    }
}

class B6 extends A6 {
    //override call me
    void callme() {
        System.out.println("Inside B's call me method");
    }
}

class C6 extends B6 {
    //override call me
    void callme() {
        System.out.println("Inside C's call me method");
    }
}

public class Dispatch {
    public static void main(String[] args) {

        A6 a = new A6(); //object of type A
        B6 b = new B6(); //object of type B
        C6 c = new C6(); //object of type C

        A6 r; //obtain a reference of type A

        r = a; //r refers to an A object
        r.callme(); //calls A's version of call me.

        r = b; //r refers to a B object
        r.callme(); //calls B's version of call me

        r = c; //r refers to a C object
        r.callme();//calls B's version of call me

    }

}
