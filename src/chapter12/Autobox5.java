package chapter12;

public class Autobox5 {
    public static void main(String[] args) {
        //Autobox/unbox a boolean
        Boolean b = true;

        //Below b is auto-unboxed when used in
        //a conditional expression such as an if.
        if (b) System.out.println("b is true");

        //Autobox/unbox char
        Character ch = 'x'; //box a char
        char ch2 = ch; //unbox a char
        System.out.println("ch2 is " + ch2);

    }
}
