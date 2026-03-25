import java.util.Scanner;

public class TernaryOperator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("number checker");

        System.out.println("num1");
        int num1 = input.nextInt();
        System.out.println("num2");
        int num2 = input.nextInt();

        int graterNumber = num1 > num2 ? num1 : num2;
        System.out.println(graterNumber + " is the greater number");

// variable = expression1 ? expression2 : expression 3
//        if (num1 > num2){
//            System.out.println("num 1 is greater than num2");
//        }else {
//            System.out.println("num 2 is greater thaan num1");
//        }
    }


}
