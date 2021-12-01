package chapter8;

/* In a class hierarchy, private members remain private to their class
 *
 * This program contains an error and will not compile
 * */
//Create a superclass
class A2 {
    int i; //default access
    private int j; //private to a

    void setij(int x, int y) {
        i = x;
        j = y;
    }


}

//A's j is not accessible  here
class B2 extends A2 {
    int total;

    void sum() {
        //total=i+j; Error  j is not accessible here
        total = i;
    }
}


public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is : ");
        subOb.sum();
    }
}
