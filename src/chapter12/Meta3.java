package chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Show all annotations for class and method.

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str();

    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "An annotation test class")
@MyAnno3(str = "Meta3",val = 99)
public class Meta3 {

    @What(description = "An annotation test method")
    @MyAnno3(str = "Testing",val = 100)
    public static void myMeth(){
        Meta3 ob = new Meta3();
        try {
            Annotation annos[]=ob.getClass().getAnnotations();
            //Display all annotations for Meta3
            System.out.println("All annotations for Meta3");
            for(Annotation a:annos){
                System.out.println(a);
            }
            System.out.println();
            //Display all annotations for myMeth
            Method m=ob.getClass().getMethod("myMeth");
            annos=m.getAnnotations();

            System.out.println("All annotations for myMeth");
            for (Annotation a:annos){
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
