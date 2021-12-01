package chapter8;

/**
 * When working with inheritance, the inferred type is the declared type of the
 * initializer, which may not be the most derived type of the object being
 * referred to by the initializer.
 */
class MyClass {
    //...
}

class FirstDerivedClass extends MyClass {
    int x;
    //..
}

class SecondDerivedClass extends FirstDerivedClass {
    int y;
    //..
}

public class TypeInferenceAndInheritance {

    //Return some type of MyClass Object
    static MyClass getObj(int which) {
        switch (which) {
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }

    }

    public static void main(String[] args) {

        /*Even though  getObj() returns different types of objects within the MyClass inheritance hierarchy
        it is declared return type is MyClass . As a result in all three cases show here, the type of the variables
        is inferred to be MyClass ,even though different derived types of objects are obtained.
        * */

        //Here getObj() returns a MyClass Object
        var mc = getObj(0);

        //In this case FirstDerivedClass object is returned
        var mc2 = getObj(1);

        //In this case SecondDerivedClass object is returned
        var mc3 = getObj(2);

        /*
         * Because the types of both mc2 and mc3 are inferred as MyClass (because the return type of getObj() is MyClass)
         * neither mc2 nor mc3 can access the fields declared by FirstDerivedClass and SecondDerivedClass */
        //mc2.x=10; WRONG MyClass does not have an x field.
        //mc3.y=10; WRONG MyClass does not have an y field.
    }
}
