package chapter12;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000; //Autobox the value iOb
        int i = iOb.byteValue();//manually unbox as byte !!!
        System.out.println(i);//does not display 1000
    }
}
