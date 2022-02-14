package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//A single member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
    //int xyz() default 50;
}

public class Single {
    @MySingle(value = 100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());//displays 100
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
