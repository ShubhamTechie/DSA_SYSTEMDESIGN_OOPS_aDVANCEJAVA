package ExceptionHand;

import java.util.Scanner;

public class ExcepHand {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        try {
            System.out.println(first / second);
        } catch (ArithmeticException exception) {
                System.out.println(" invalid vallue divide bye zero");
        }finally {
            System.out.println("finally done");
        }

    }
}
