package ExecutorService;

public class SleepTask implements Runnable{

    @Override
    public void run() {

        Thread current = Thread.currentThread();
        System.out.printf("STARTED current threads %s\n" , current.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("END CURRENT THREAD %s\n",current.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
