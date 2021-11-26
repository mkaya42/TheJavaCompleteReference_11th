package chapter4;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a is "+a);
        System.out.println("i and b is "+i+" "+b);


    }
}
