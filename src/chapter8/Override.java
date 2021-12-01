package chapter8;

//Method overriding

class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show() {
        System.out.println("i and j : " + i + " " + j);
    }

}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() { //display -k this overrides show() in A
        super.show();//This calls A's show..
        System.out.println("k: " + k);
    }

}

public class Override {

    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show();
    }
}
