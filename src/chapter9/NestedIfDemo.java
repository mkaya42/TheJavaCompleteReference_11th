package chapter9;

//A nested interface example

//This class contains a member interface
class A {
    //this is a nested interface
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

//B implements the nested interface
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIfDemo {
    public static void main(String[] args) {
        //use a nested interface reference
        A.NestedIf nif = new B();
        if(nif.isNotNegative(10))
            System.out.println(" 10 is not negative ");
        if(nif.isNotNegative(-12))
            System.out.println("This won't be displayed.");
    }
}
