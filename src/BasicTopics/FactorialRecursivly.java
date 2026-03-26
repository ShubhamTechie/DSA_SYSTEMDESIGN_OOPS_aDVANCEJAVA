package BasicTopics;

import java.util.Scanner;

public class FactorialRecursivly {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int num = input.nextInt();
        long fac =facRecursive(num);
        System.out.println(fac);
    }

    public static long facRecursive(int num){
        if (num==1){
            return 1;
        }
        return num * facRecursive(num-1);
    }
}
