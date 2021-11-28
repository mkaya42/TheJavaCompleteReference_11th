package chapter6;

/*Here, Box Uses a parameterized constructor to
  initialize  the dimensions of a box */

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double vol;

        //display volume of first box
        vol = myBox1.volume2();
        System.out.println("Volume is " + vol);
        //display volume of second box
        vol = myBox2.volume2();
        System.out.println("Volume is " + vol);
    }
}
