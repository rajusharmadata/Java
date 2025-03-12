package multiThreading.Thread.secondMethodToCreateThread;

public  class First {

    public static void main(String[] args) {
        Second obj = new Second();

        Thread t1 = new Thread(obj);
        t1.start();

        System.out.println(Thread.currentThread().getName());


//

    }
}