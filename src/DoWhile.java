import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {


        Scanner inpot = new Scanner(System.in);


        int age;
        do {
            age = inpot.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("enter your age" + age);
    }

}
