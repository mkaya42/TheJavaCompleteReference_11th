package chapter14;

//NonGen is functionally equivalent to Gen
//but does not use generics


class NonGen {
    Object ob; //ob is now of type Object

    //Pass the constructor a reference to
    //an object of type Object
    NonGen(Object o) {
        ob = o;
    }

    //Return type object
    Object getOb() {
        return ob;
    }

    //Show type of ob.
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

//Demonstrate the non generic class
class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        //Create a NonGen object and store
        // an integer in it. Autoboxing still occurs
        iOb = new NonGen(88);

        //Show the type of date used by iOb
        iOb.showType();

        //Get the value of iOb
        int v = (Integer) iOb.getOb();
        System.out.println("value : " + v);

        System.out.println();

        //Create another NonGen Object and
        //store a String in it.
        NonGen strOb = new NonGen("Non Generics Test");

        // Show the type of date used by strOb
        strOb.showType();

        //Get the value of strOb
        //Again the noticed that the cast is necessary.
        String str = (String) strOb.getOb();

        //This compiles but conceptually wrong
        iOb=strOb;
        v=(Integer)iOb.getOb();

    }
}
