package chapter11;

//Create a second thread by extending thread
class NewThread2 extends Thread {

    NewThread2() {
        super("Demo Thread");
        System.out.println("Child Thread " + this);

    }

    //This is the entry point for the second thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }

}

public class ExtentThread {
    public static void main(String[] args) {
        NewThread2 nt = new NewThread2();
        nt.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exiting main thread");

    }
}
