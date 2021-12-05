package chapter9;

//Use default method..

public class DefaultMethodDemo {

    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        //Can call getNumber() because it is explicitly implemented in MyIFImp
        System.out.println(obj.getNumber());

        //Can also call getString() because of default implementation
        System.out.println(obj.getString());

        MyIFImp2 obj2 = new MyIFImp2();
        //Can call getNumber() because it is explicitly implemented in MyIFImp2
        System.out.println(obj2.getNumber());

        //Can also call getString() it is implemented in MyIFImp2
        System.out.println(obj2.getString());


        //Since getDefaultNumber() method is static we had chance to use it by its interface name
        int defNum = MyIF2.getDefaultNumber();
        System.out.println("Default Number " + defNum);
    }
}
