package chapter12;

import java.lang.annotation.*;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();

    int val();
}

public class Meta2 {

    //myMeth has two arguments
    @MyAnno2(str = "Two arguments", val = 19)
    public static void myMeth(String str, int i) {
        Meta2 ob = new Meta2();
        try {
            Class<?> c = ob.getClass();

            //Here the parameter types are specified
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno2 anno2 = m.getAnnotation(MyAnno2.class);

            System.out.println(anno2.str() + " " + anno2.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test",10);
    }
}
