package multiThreading.Thread.ThereadMethods.priortyMethod;
public  class Test extends Thread{

    public Test(String name){
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            for(int j = 0;j<100000;j++){
            }
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName() + "-priority" + Thread.currentThread().getPriority() + "-count " + i);


        }
    }
}