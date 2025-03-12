package multiThreading.Thread.firstMethodToCreateThread;

public class World extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); // new Create Thread
    }
}
