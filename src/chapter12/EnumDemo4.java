package chapter12;

//Demonstrate ordinal(),compareTo() and equals()

//An enumeration of apple varieties
enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland

}

public class EnumDemo4 {

    public static void main(String[] args) {
        Apple4 ap, ap2, ap3;

        //Obtain all ordinal values using ordinal()
        System.out.println("Here are all apple constants and  their ordinal values");
        for (Apple4 a : Apple4.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple4.RedDel;
        ap2 = Apple4.GoldenDel;
        ap3 = Apple4.RedDel;

        System.out.println();

        //Demonstrate compareTo() and equals()
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before" + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " comes before" + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " equals " + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)) {
            System.out.println("Error!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);

        }
        if (ap == ap3) {
            System.out.println(ap + " equals " + ap3);

        }
    }
}
