package multiThreading.Thread.secondMethodToCreateThread;

public class Second implements Runnable{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}