package chapter9;

public interface IntStack {
    void push(int item); //store an item
    int pop(); //retrieve an item

    //Because clear() is default ,it need not be implemented by a preexisting class that uses IntStack
    default void clear(){
        System.out.println("clear() not implemented");
    }
}
