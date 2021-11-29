package chapter7;

import org.w3c.dom.ls.LSOutput;

//Objects are passed through their references..
class Test3 {

    int a, b;

    Test3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Pass an object
    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String[] args) {
        Test3 ob=new Test3(15,20);
        System.out.println("ob.a and ob.b before method call "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after method call "+ob.a+" "+ob.b);

    }

}
