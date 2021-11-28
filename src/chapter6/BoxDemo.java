package chapter6;

//This class declares an object of type box.
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //assign values to mybox's instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //compute the volume of box
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is vol " + vol);
    }
}
