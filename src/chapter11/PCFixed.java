package chapter11;

//A correct implementation of a Producer and Consumer..

class Q2 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
            System.out.println("Got :" + n);


        }
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Put :" + n);
            notify();


        }
    }
}
class Producer2 implements Runnable {

    Q q;
    Thread t;

    public Producer2(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");

    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class Consumer2 implements Runnable {
    Q q;
    Thread t;

    public Consumer2(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Producer2 p = new Producer2(q);
        Consumer2 c = new Consumer2(q);

        //start the threads..
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop");
    }
}
