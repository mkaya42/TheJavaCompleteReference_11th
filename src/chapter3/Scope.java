package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x; //known to all code within main
        x = 10;
        if (x == 10) {//start a new scope
            int y = 20;
            //x and y both known here
            System.out.println("x and y : " + x + " and " + y);
            x = y * 2;

        }
        //y=100; //error y is not known here
        System.out.println("x is " + x);
    }
}
