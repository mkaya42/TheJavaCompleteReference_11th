package chapter7;

//Here box allows one object to initialize another

class Box2 {

    double width;
    double height;
    double depth;

    //Constructor used when no dimension is specified.
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor used when all dimensions are specified.
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    //Notice this constructor , it takes an object of type Box.
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Constructor used when cube is created.
    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

public class OverloadCons2 {
    public static void main(String[] args) {

        //Creates boxes using the various constructor..
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        Box2 myClone = new Box2(myBox1);
        double volume;

        //Get volume of the first Box
        volume = myBox1.volume();
        System.out.println("Volume of myBox1 is " + volume);

        //Get volume of second Box
        volume = myBox2.volume();
        System.out.println("Volume of myBox2 is " + volume);

        //Get volume of cube
        volume = myCube.volume();
        System.out.println("Volume of myCube is " + volume);

        //Get volume of clon
        volume = myClone.volume();
        System.out.println("Volume of clone is " + volume);


    }
}
