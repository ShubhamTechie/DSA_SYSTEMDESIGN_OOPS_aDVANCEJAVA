import java.util.Scanner;

public class PalindromeByRecursion {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("number checker");
        String str = input.next();
        System.out.println("your string is "
                + (isPalindrome(str) ? "palindrome"
                : "not palindrome"));


    }

    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
