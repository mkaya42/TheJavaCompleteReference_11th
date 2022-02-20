package chapter13;

public class MyClass {
    int a, b;

    //initializes a and b
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    //initialize a and b to the same value
    MyClass(int i) {
        a = i;
        b = i;
    }

    //initialize a and b default values 0
    MyClass() {
        a = 0;
        b = 0;
    }
}
