package chapter6;

public class BoxDemo4 {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        //assign value to myBox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        //assign value to myBox2's instance variables
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        //display volume of first box
        vol = myBox1.volume2();
        System.out.println("Volume is " + vol);
        //display volume of second box
        vol = myBox2.volume2();
        System.out.println("Volume is " + vol);

    }

}
