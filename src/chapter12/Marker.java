package chapter12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//A marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {

    //Annotate a method using a marker
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            //Determine if the annotation is present
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("My Marker is Present");

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
