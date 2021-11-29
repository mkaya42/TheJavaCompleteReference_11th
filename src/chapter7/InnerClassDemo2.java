package chapter7;

class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display() {
                    System.out.println("display : outer_x = " + outer_x);
                }
            }
            Inner2 inner = new Inner2();
            inner.display();
        }


    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
