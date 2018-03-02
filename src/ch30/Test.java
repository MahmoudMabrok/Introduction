package ch30;

/**
 * this is
 * Created by mo3tamed on 2/25/18.
 */
public class Test implements  Runnable {

    public static void main(String[] args) {
    new Test() ;
    }

    public Test() {
        Thread t = new Thread(this);
        t.start();
        t.start();//Exception in thread "main" java.lang.IllegalThreadStateException
                // as threadStatus is became not zero , so you ca not start it (already started)
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
