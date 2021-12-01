package chapter8;

//This program uses inheritance to extend Box
class Box2 {
    double width;
    double height;
    double depth;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(int len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }


}

//Here Box2 is extended to include weight
class BoxWeight2 extends Box2 {
    double weight;

    BoxWeight2(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight2 weightBox = new BoxWeight2(3, 5, 7, 8.37);
        Box2 plainBox = new Box2();
        double vol;
        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        //Assign BoxWeight reference to Box reference (it is permissible)
        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume of plainBox is " + plainBox);

        /*The following statement is invalid because plainBox does not define a weight number*/
        //System.out.println("Weight of plainBox is "+plainBox.weight);


    }
}
