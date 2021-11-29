package chapter7;

//This class defines an integer stack that can hold 10 values

class Stack {

    /* Now both stck and tos are private .This means that they can not be accidentaly or maliciously altered
     * in a way that would be harmful to the stack*/
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //Push some numbers onto stack

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int j = 10; j < 20; j++) {
            myStack2.push(j);
        }

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2");
        for (int j = 10; j < 20; j++) {
            System.out.println(myStack2.pop());
        }

        //This is illegal, since instances are private.
        //myStack1.tos=5;
    }
}
