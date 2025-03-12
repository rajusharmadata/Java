package multiThreading.Thread.ThereadMethods.SleepMethod;

import java.awt.*;

public class Test extends Thread {
    @Override
    public void run() {
        try {
            for(int i = 0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);

            }
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}