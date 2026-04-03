package Multithreading;

public class NeedOfMultiThreading {


    public static void main(String[] args) {

//        long stratTask = System.currentTimeMillis();

        System.out.println("\n starting first thread");
        FirstTask t1 = new FirstTask();
        System.out.println("\n starting second thread");
        SecondTask t2 = new SecondTask();
        System.out.println("\n starting third thread");
        ThirdTask T3 = new ThirdTask();

        t1.start();
        t2.start();
        T3.start();




//        for (int i = 1; i < 1000; i++) {
//            System.out.printf("%d*  ", i);
//        }
//        System.out.println("\n * task completed");
//        for (int i = 1; i < 1000; i++) {
//            System.out.printf("%d# ", i);
//        }
//        System.out.println("\n # task completed");
//        for (int i = 1; i < 1000; i++) {
//            System.out.printf("%d$ ", i);
//        }
//        System.out.println("\n # task completed");
//        long endTak = System.currentTimeMillis();
//        System.out.printf("total time taken %d", (endTak - stratTask));

    }
}
