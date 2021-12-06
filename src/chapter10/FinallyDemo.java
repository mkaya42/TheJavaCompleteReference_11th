package chapter10;

//Demonstrate finally

public class FinallyDemo {

    //throw an exception out of the method.
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    //Return within a try block
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("ProcB's finally");
        }
    }

    //Execute try block normally
    static void procC() {
        try {
            System.out.println("Inside procC");

        } finally {
            System.out.println("ProcC's finally");

        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught " + e);
        }
        procB();
        procC();
    }
}
