package chapter7;
//Local variable type inference with user defined class type.
class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10); //Notice the use of var here..
        System.out.println("Value of i in mc is : " + mc.getI());
        mc.setI(19);
        System.out.println("Value of i in mc is now " + mc.getI());
    }
}
