package multiThreading.Thread.ThereadMethods.priortyMethod;



public  class priorty {
    public static void main(String[] args) {
        Test t3 = new Test("Raju");
        Test t4 = new Test("Ram");
        Test t5 = new Test("Shyam");
        Test t6 = new Test("Rohit");

        t3.setPriority(Thread.MAX_PRIORITY); // give a random priority
        t4.setPriority(Thread.MIN_PRIORITY);// give a random priority
        t5.setPriority(Thread.NORM_PRIORITY);// give a random priority
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
