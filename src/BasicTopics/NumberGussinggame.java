package BasicTopics;

import java.util.Scanner;

public class NumberGussinggame {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to number gussing game");

         int num=5 , guess;
         do {
             System.out.println("please guess the number between 0 to 10");
             guess = input.nextInt();

         }while (num != guess);

        System.out.println("you have suggesfully guess");
}
}
