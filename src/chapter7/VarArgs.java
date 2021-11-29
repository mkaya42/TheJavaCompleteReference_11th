package chapter7;

//Demonstrate variable length arguments..
public class VarArgs {

    static void vaTest(int... v) {
        System.out.print("Number of args " + v.length + " Contents: ");

        for (int x : v) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
