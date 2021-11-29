package chapter7;

class Stack2 {

    private int stck[];
    private int tos;

    //Allocate and initialize stack
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto stack
    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    //Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class TestStack2 {
    public static void main(String[] args) {

        Stack2 myStack1 = new Stack2(5);
        Stack2 myStack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }

    }
}
