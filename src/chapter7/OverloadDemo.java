package chapter7;

//Demonstrate method overloading
public class OverloadDemo {

    void test() {
        System.out.println("No parameters");
    }

    //Overload test with one integer parameter
    void test(int a) {
        System.out.println("a = " + a);
    }

    //Overload test with two integer parameters
    void test(int a, int b) {
        System.out.println("a and b :" + a + " " + b);
    }

    //Overload test for a double parameter
    double test(double a) {
        System.out.println("double a : " + a);
        return a * a;
    }


}
