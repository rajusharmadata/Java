package multiThreading.Thread.firstMethodToCreateThread;

public class Hello {
    public static void main(String[] args) {

        World world  = new World();// create world obj
        world.start(); // Start new Thered
        System.out.println(Thread.currentThread().getName()); // Defalult main Thread

    }
}
