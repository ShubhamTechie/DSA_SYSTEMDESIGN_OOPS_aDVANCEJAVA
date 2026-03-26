package BasicTopics;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("number checker");
        String password;
        do {
            System.out.println("enter password");
            password = input.next();
        } while (!isValidPass(password));
        System.out.println("thanks for entering a valid password");
    }

    public static boolean isValidPass(String password) {


        return password.length() > 6;
    }


}
