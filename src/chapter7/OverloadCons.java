package chapter7;
/* Here , Box defines three constructors to initialize
   the dimension of a box various ways */

class Box {

    double width;
    double height;
    double depth;


    //Constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions specified
    Box() {
        width = -1;  //use -1 to indicate
        height = -1; //an uninitialized
        depth = -1;  //box
    }

    //Constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }
}


public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box();
        Box myCube=new Box(7);

        double volume;

        //Get volume of first box
        volume=myBox1.volume();
        System.out.println("Volume of myBox1 : "+volume);

        //Get volume of second box
        volume=myBox2.volume();
        System.out.println("Volume of myBox2 : "+volume);

        //Get volume of myCube
        volume=myCube.volume();
        System.out.println("Volume of myCube : "+volume);
    }
}
