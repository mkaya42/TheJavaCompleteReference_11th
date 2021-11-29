package chapter7;

/*This program demonstrates the difference between public and private*/

class Test5 {
    int a;
    public int b;
    private int c;

    //methods to access c
    void setc(int i) {
        c = i; //Sets c's value
    }

    int getc() {
        return c; //Gets c's value
    }

}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        //These are ok a and b can be accessed directly
        ob.a = 10;
        ob.b = 20;

        //This is not ok , will cause an error.
        // ob.c=100;

        //You must access c through its methods.
        ob.setc(100);

        System.out.println("a, b and c :" + ob.a + " " + ob.b + " " + ob.getc());
    }
}
