package Multithreading;

public class TestingRunnables {


    public static void main(String[] args) throws Exception{


        PrintTASK p1 = new PrintTASK('*');
        PrintTASK p2 = new PrintTASK('#');
        PrintTASK p3 = new PrintTASK('$');


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
