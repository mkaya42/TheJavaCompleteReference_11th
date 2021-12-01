package chapter8;

class Box3 {
    private double width;
    private double height;
    private double depth;

    Box3(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }


}

class BoxWeight3 extends Box3 {

    double weight;//weight of box

    //Constructor clone of an object
    BoxWeight3(BoxWeight3 ob) {// Pass object to constructor..
        super(ob);
        weight = ob.weight;
    }

    //Constructor when all parameters are specified
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //Default constructor
    BoxWeight3() {
        super();
        weight = -1;
    }

    //Constructor when cube is created
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }

}

public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight3 myBox1 = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 myBox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 myBox3 = new BoxWeight3();//default
        BoxWeight3 myCube = new BoxWeight3(3, 2);
        BoxWeight3 myClone = new BoxWeight3(myBox1);
        double vol;

        vol=myBox1.volume();
        System.out.println("Volume of myBox1 is : "+vol);
        System.out.println("Weight of myBox1 is : "+myBox1.weight);
        System.out.println();

        vol=myBox2.volume();
        System.out.println("Volume of myBox2 is : "+vol);
        System.out.println("Weight of myBox2 is : "+myBox2.weight);
        System.out.println();

        vol=myBox3.volume();
        System.out.println("Volume of myBox3 is : "+vol);
        System.out.println("Weight of myBox3 is : "+myBox3.weight);
        System.out.println();

        vol=myClone.volume();
        System.out.println("Volume of myClone is : "+vol);
        System.out.println("Weight of myClone is : "+myClone.weight);
        System.out.println();

        vol=myCube.volume();
        System.out.println("Volume of myCube is : "+vol);
        System.out.println("Weight of myCube is : "+myCube.weight);
        System.out.println();

    }
}
