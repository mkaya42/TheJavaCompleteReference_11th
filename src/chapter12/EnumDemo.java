package chapter12;

//An enumeration of Apple varieties
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap;
        ap = Apple.RedDel;

        //Output an enum value
        System.out.println("Value of ap " + ap);
        System.out.println();

        ap=Apple.GoldenDel;

        //Compare two enum values
        if(ap==Apple.GoldenDel){
            System.out.println(" ap contains GoldenDel \n");
        }

        //use enum to control switch statement..
        switch (ap){
            case Jonathan:
                System.out.println("Jonathan is Red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is Yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is Red");
                break;
            case Winesap:
                System.out.println("Case Winesap is Red");
                break;
                
        }
    }
}
