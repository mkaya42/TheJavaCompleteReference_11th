package chapter9;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack mystack1=new DynStack(5);
        DynStack mystack2=new DynStack(8);

        //push some numbers onto the stack
        for(int i=0;i<12;i++)mystack1.push(i);
        for(int i=0;i<20;i++)mystack2.push(i);

        //pop those number of the stack
        System.out.println("Stack in mystack1");
        for(int i =0;i<12;i++) System.out.println(mystack1.pop());

        System.out.println("Stack in mystack1");
        for(int i =0;i<20;i++) System.out.println(mystack2.pop());
    }
}
