package chapter9;

public class Client implements Callback {

    //implements Callback's interface
    public void callback(int p) {
        System.out.println("Callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implements interfaces may also define other members too");
    }
}
