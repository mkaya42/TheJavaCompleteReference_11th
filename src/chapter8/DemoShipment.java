package chapter8;

class Box4 {
    private double width;
    private double height;
    private double depth;

    Box4(Box4 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box4() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box4(double len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }


}

class BoxWeight4 extends Box4 {

    double weight;//weight of box

    //Constructor clone of an object
    BoxWeight4(BoxWeight4 ob) {// Pass object to constructor..
        super(ob);
        weight = ob.weight;
    }

    //Constructor when all parameters are specified
    BoxWeight4(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //Default constructor
    BoxWeight4() {
        super();
        weight = -1;
    }

    //Constructor when cube is created
    BoxWeight4(double len, double m) {
        super(len);
        weight = m;
    }

}

//Add shipping costs
class Shipment extends BoxWeight4 {
    double cost;

    //Constructor clone of an object
    Shipment(Shipment ob) {//pass object to constructor..
        super(ob);
        cost = ob.cost;
    }

    //Constructor when all parameters are specified..
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); //call superclass constructor..
        cost = c;
    }

    //default constructor
    Shipment() {
        super();
        cost = -1;
    }

    //Constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is : " + vol);
        System.out.println("Weight of shipment1 is : " + shipment1.weight);
        System.out.println("Cost of shipment1 is : " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is : " + vol);
        System.out.println("Weight of shipment2 is : " + shipment2.weight);
        System.out.println("Cost of shipment2 is : " + shipment2.cost);
        System.out.println();
    }
}
