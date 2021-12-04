package chapter9.p2;



public class OtherPackage {
    OtherPackage(){
        chapter9.p1.Protection p1 = new chapter9.p1.Protection();
        System.out.println("other package constructor");

        //System.out.println("n= " + p1.n); //class or package only
        //System.out.println("n_pri= " + p1.n_pri); //class only
        //System.out.println("n_pro= " + p1.n_pro); //class , subclass or package only
        System.out.println("n_pub= " + p1.n_pub);
    }


}
