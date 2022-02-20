package chapter13;

public class MyClass2 {
    int a, b;

    //initializes a and b
    MyClass2(int i, int j) {
        a = i;
        b = j;
    }

    //initialize a and b to the same value
    MyClass2(int i) {
       this(i,i);
    }

    //initialize a and b default values 0
    MyClass2() {
       this(0);
    }
}
