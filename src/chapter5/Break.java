package chapter5;

//Using break as civilized form of goto
public class Break {
    public static void main(String[] args) {

        boolean t=true;
        first :{
            second :{
                third :{
                    System.out.println("Before the break");
                    if(t) break second;//Break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }
    }
}
