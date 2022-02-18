package chapter12;

//Demonstrate a repeated annotation

import java.lang.annotation.*;
import java.lang.reflect.*;

//Make MyAnno repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno5{
    String str() default "Testing";
    int val() default 9000;
}

//This is the container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno5[] value();
}
public class RepeatAnno {

//Repeat MyAnno5 on myMeth()
    @MyAnno5(str = "First annotation",val = -1)
    @MyAnno5(str = "Second annotation",val = 100)
    public static void myMeth(String str,int i){
        RepeatAnno ob =new RepeatAnno();
        try {
            Class c =ob.getClass();

            //Obtain the annotations for myMeth
            Method m = c.getMethod("myMeth",String.class,int.class);

            //Display the repeated MyAnno annotations
            Annotation anno =m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);

        }catch (NoSuchMethodException e){
            System.out.println("Method not found.");
        }

    }

    public static void main(String[] args) {
        myMeth("test",10);
    }
}
