 package multiThreading.Thread.ThereadMethods.SleepMethod ;


 public  class SleepMethod {
    public static void main(String[] args) {
        Test t2 = new Test();
        t2.start();
        try {
            t2.join();

        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t2.getState());


    }
}