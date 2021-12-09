package chapter11;

//Create multiple Threads

class NewThread3 implements Runnable {
    Thread t;
    String name;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread "+t);
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(name + " : " + n);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println("Exiting " + name + " thread");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            for(int i =5;i>0;i--){
                System.out.println(" name "+i);
                //wait for other threads to end.
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");

        }
        System.out.println("Main thread exiting");
    }

}
