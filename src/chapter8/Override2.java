package chapter8;
//Methods with differing typw signature are overloaded -not overriden.

class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show() {
        System.out.println("i and j : " + i + " " + j);
    }

}

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //Overload Show
    void show(String msg) { //display -k this overrides show() in A

        System.out.println("k: " + k);
    }

}

public class Override2 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show("This is k : "); // This calls show in B5
        subOb.show(); //This calls show in A5

    }

}
