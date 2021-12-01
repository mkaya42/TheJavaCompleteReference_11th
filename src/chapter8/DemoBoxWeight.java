package chapter8;


//This program uses inheritance to extend Box
class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(int len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }


}

//Here Box is extended to include weight
class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        System.out.println("Volume of myBox1 is " + myBox1.volume());
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();
        System.out.println("Volume of myBox2 is " + myBox2.volume());
        System.out.println("Weight of myBox2 is " + myBox2.weight);

    }
}
