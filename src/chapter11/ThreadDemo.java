package chapter11;
//Create a second Thread

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //Create a new second thread
        t = new Thread(this, "demo thread");
        System.out.println("Child Thread "+t);


    }

    //This is entry point for the second thread
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread "+n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); //Create a new thread
        nt.t.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
