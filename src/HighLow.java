import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        /**
         *
         * Welcome to the world of game development!
         *
         * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
         *
         * The specs for the game are:
         *
         * Game picks a random number between 1 and 100.
         * Prompts user to guess the number.
         * All user inputs are validated.
         * If user's guess is less than the number, it outputs "HIGHER".
         * If user's guess is more than the number, it outputs "LOWER".
         * If a user guesses the number, the game should declare "GOOD GUESS!"
         * Hints
         *
         * Use the random method of the java.lang.Math class to generate a random number.
         * Bonus
         *
         * Keep track of how many guesses a user makes.
         * Set an upper limit on the number of guesses.
         *
         *
         */

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int newNumber = rand.nextInt(100) + 1;
        int guess = 0;

        boolean found = false;
       // System.out.println(newNumber);

        int guessCounter = 0;
        int limit = 100 - newNumber;

        while (!found){
            System.out.println("Please enter a number between 1 and 100");
            while (!input.hasNextInt()) input.next();
            guess = input.nextInt();

            if (guess == newNumber) {
                System.out.println("GOOD GUESS!");
                found = true;
            } else if (guess < newNumber) {
                System.out.println("HIGHER");

            } else {
                System.out.println("LOWER!");
            }
            guessCounter++;
            if (guessCounter == limit) {
                System.out.format("Game over !. The number was %d ", newNumber);
                found = true;
            }

        }


    }
}
