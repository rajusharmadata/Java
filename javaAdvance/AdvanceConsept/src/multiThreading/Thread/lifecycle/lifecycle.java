// LIFE CYCLE OF THREAD
package multiThreading.Thread.lifecycle;
public  class lifecycle extends Thread{ // Extend the Thread class
    @Override
    public void run() { // yaha par throws karnge to error why? --Because override The method
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e); // print the error
        }
    }

    public static void main(String[] args) throws InterruptedException { // Handel the unhanded exception
        lifecycle  t1 = new lifecycle();// create a t1 obj
        System.out.println( t1.getState()); // check the current status of t1 --> NEW  -- STAGE-I
        t1.start();
        System.out.println(t1.getState());// check the current status of t1 --> RUNNABLE -- STAGE-II
        Thread.sleep(100);// pause The Main Thread Excuation
        System.out.println(t1.getState()); // check the current state of t1 --> TIMED_WAITING -- STAGE-III
        t1.join();// means --> jis par ham call kar rahe hai uska wait kar raha hai main Thread
        System.out.println(t1.getState()); // check the current state of t1 --> TERMINATED -- STAGE-IV
    }

}