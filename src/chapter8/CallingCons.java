package chapter8;

class A1 {
    A1() {
        System.out.println("Inside A's Constructor");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("Inside B's Constructor");
    }
}

class C1 extends B1 {
    C1() {
        System.out.println("Inside C's Constructor");
    }
}


public class CallingCons {

    public static void main(String[] args) {
        C1 c =new C1();
    }
}
