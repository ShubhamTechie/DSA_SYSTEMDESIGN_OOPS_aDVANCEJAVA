package Multithreading;

public class PrintTASK implements Runnable{


    @Override
    public void run() {

        for (int i = 1; i <1000 ; i++) {
            System.out.printf("%d%c  ",i ,targetChar);
        } System.out.printf("\n %s %c  task completed" , Thread.currentThread().getName(),targetChar);

    }


    public final char targetChar;

    public PrintTASK(char targetChar) {
        this.targetChar = targetChar;
    }
}
