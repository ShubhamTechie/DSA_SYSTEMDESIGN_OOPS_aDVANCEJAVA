package BasicTopics;

import java.util.Scanner;

class GusseningGame {


    int random;

    GusseningGame() {

         random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the number that player gussed
     * @return - Negative if the guessed number is smaller
     * - 0 if the guessed number is correct
     * - positive if the guessed number is higher
     */

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GusseningGame game = new GusseningGame();
        int guess;
        int result;
        do {
            System.out.print("guess the number");
            guess = sc.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("correct");
            } else if (result < 0) {
                System.out.println("guess higer");
            } else {
                System.out.println("please guess lower");
            }
        } while (result != 0) ;
    }
}


