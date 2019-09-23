import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        /**
         *
         *
         * Basic Arithmetic
         *
         * Create four separate methods. Each will perform an arithmetic operation:
         *
         * Addition
         * Subtraction
         * Multiplication
         * Division
         * Each function needs to take two parameters/arguments so that the operation can be performed.
         *
         *
         **/

//        System.out.println(Add(5, 10));
//        System.out.println(Add(5.8, 10.5));
//
//        System.out.println(Subtraction(5, 10));
//
//        System.out.println(Multiplication(5, 10));
//
//        System.out.println(Division(10, 5));
//
//        System.out.println(Mod(10, 5));
//
//        System.out.println(Mod(10, 3));
//
//        System.out.println(Mod(10, 0));


        /**
         *
         * Test your methods and verify the output.
         *
         * Add a modulus method that finds the modulus of two numbers.
         *
         * Food for thought: What happens if we try to divide by zero? What should happen?
         *
         * Bonus
         *
         * Create your multiplication method without the * operator (Hint: a loop might be helpful).
         * Do the above with recursion.
         *
         **/

//        System.out.println("New multiplication " + newMultiplication(2, 5));
//
//        System.out.println(recMultiplication(5, 2));
//        System.out.println(recMultiplication(3, 3));
//        System.out.println(recMultiplication(1, 3));


        /**
         * Create a method that validates that user input is in a certain range
         *
         * The method signature should look like this:
         *
         *
         * public static int getInteger(int min, int max);
         * and is used like this:
         *
         *
         * System.out.print("Enter a number between 1 and 10: ");
         * int userInput = getInteger(1, 10);
         * If the input is invalid, prompt the user again.
         *
         * Hint: recursion might be helpful here!
         *
         *
         **/

//        getInteger(1, 10);

        /**
         * Calculate the factorial of a number.
         *
         * Prompt the user to enter an integer from 1 to 10.
         * Display the factorial of the number entered by the user.
         * Ask if the user wants to continue.
         * Use a for loop to calculate the factorial.
         * Assume that the user will enter an integer, but verify it’s between 1 and 10.
         * Use the long type to store the factorial.
         * Continue only if the user agrees to.
         * A factorial is a number multiplied by each of the numbers before it.
         * Factorials are denoted by the exclamation point (n!). Ex:
         *
         *
         * 1! = 1               = 1
         * 2! = 1 x 2           = 2
         * 3! = 1 x 2 x 3       = 6
         * 4! = 1 x 2 x 3 x 4   = 24
         * Bonus
         *
         * Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
         * Use recursion to implement the factorial.
         *
         */

//        System.out.println("\n\nfactorial!!!");
//
//        factorial();
//
//        System.out.println("\n\nfactoria 2 l!!!");
//
//        factorial2();

        /**
         * Create an application that simulates dice rolling.
         *
         * Ask the user to enter the number of sides for a pair of dice.
         * Prompt the user to roll the dice.
         * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
         * Use static methods to implement the method(s) that generate the random numbers.
         * Use the .random method of the java.lang.Math class to generate random numbers.
         * Game Development 101
         *
         **/

        rollDice();

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

        /**
         * Console Adventure Game!
         *
         * This is a paired exercise, so find yourself a fellow adventurer before getting started!
         *
         * Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.
         *
         * The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:
         *
         * Ask if the user is ready to start. If they type in "yes", start the game.
         * Ask the user for their name. Store this as a variable to personalize the adventure.
         * A classic RPG will have the hero going through different scenarios and battling their enemies.
         * Display enemy stats and hero stats. Properties and values can be assigned by you.
         * For example: Health, Attack Points, etc.
         * Decide on what actions your hero can take.
         * Attack (decreases enemyHealth)
         * Drink potion (adds to heroHealth)
         * Run? (ends the game)
         * Keep asking for user input until the enemyHealth reaches 0, then end the game.
         * Bonuses
         *
         * Allow the user to specify hero stats and enemy stats.
         * Automate an enemyAttack after each time the hero takes a turn.
         * End the game if either heroHealth or enemyHealth drops to 0.
         * Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
         *
         * Remember that these are only suggestions. Feel free to get creative and have fun!!
         */
    }

    public static long Add(long num1, long num2) {
        return num1 + num2;
    }

    public static double Add(double num1, double num2) {
        return num1 + num2;
    }


    public static double Subtraction(double num1, double num2) {
        return num1 - num2;
    }


    public static double Multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static double Mod(double num1, double num2) {
        return (num2 == 0) ? 0 : num1 % num2;
    }

    public static long newMultiplication(long num1, long num2) {
        long result = 0;
        for (var i = 0; i < num2; i++) {
            result += num1;
        }

        return result;
    }

    public static long recMultiplication(long num, long times) {
        if (times <= 0) {
            return 0;
        }
        //System.out.println(n);
        return num + recMultiplication(num, times - 1);
    }

    /**
     * Create a method that validates that user input is in a certain range
     * <p>
     * The method signature should look like this:
     * <p>
     * <p>
     * public static int getInteger(int min, int max);
     * and is used like this:
     * <p>
     * <p>
     * System.out.print("Enter a number between 1 and 10: ");
     * int userInput = getInteger(1, 10);
     * If the input is invalid, prompt the user again.
     * <p>
     * Hint: recursion might be helpful here!
     **/

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n getInteger \n Enter a number between 1 and 10: ");
        // Check if the scanner has a number
        if (input.hasNextInt()) {
            int userInput = input.nextInt();
            //* If the input is invalid, prompt the user again.
            if (userInput >= min && userInput <= max) {
                System.out.format("The number %d is between %d and %d", userInput, min, max);
                return userInput;
            } else {
                System.out.format("The number %d is not between %d and %d", userInput, min, max);
                //return 0;
                return getInteger(min, max);
            }
        } else {
           // System.out.println("Please enter a number");
            return getInteger(min, max);
        }

    }


    /**
     *
     * public static int getInteger(int min, int max) {
     *         Scanner sc = new Scanner(System.in);
     *         if (sc.hasNextInt()) {
     *             int userNum = sc.nextInt();
     *             if (userNum >= min && userNum <= max) {
     *                 return userNum;
     *             } else {
     *                 System.out.println("Invalid Range");
     *             }
     *         } else {
     *             System.out.print("Invalid Input");
     *         }
     *         return 0;
     * //       int userInput = getInteger(1, 10);
     *     }
     */


    /**
     * Calculate the factorial of a number.
     * <p>
     * Prompt the user to enter an integer from 1 to 10.
     * Display the factorial of the number entered by the user.
     * Ask if the user wants to continue.
     * Use a for loop to calculate the factorial.
     * Assume that the user will enter an integer, but verify it’s between 1 and 10.
     * Use the long type to store the factorial.
     * Continue only if the user agrees to.
     * A factorial is a number multiplied by each of the numbers before it.
     * Factorials are denoted by the exclamation point (n!). Ex:
     * <p>
     * <p>
     * 1! = 1               = 1
     * 2! = 1 x 2           = 2
     * 3! = 1 x 2 x 3       = 6
     * 4! = 1 x 2 x 3 x 4   = 24
     * Bonus
     * <p>
     * Test the application and find the integer for the highest factorial that can be accurately calculated by this application,
     * then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}".
     * Don’t forget to change your verification too!
     * Use recursion to implement the factorial.
     */
    public static void factorial() {
        //Scanner input = new Scanner(System.in);
       // System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10); //input.nextInt();
        var result = 1;
        var middleString = "";
        for (var i = 1; i <= userInput; i++) {
            result *= i;
            if (middleString.length() > 0) middleString += " x ";
            middleString += "" + i;
            System.out.format("\n%d! = %s = %d", i, middleString, result);
        }
        return;
    }

    public static void factorial2() {

        //System.out.print("Enter a number between 1 and 10: ");
        //int userInput = input.nextInt();
        ;

        int index = 1;
        long res = 1;
        while (res < Integer.MAX_VALUE) {
            res = res * index;
            index++;
        }

        System.out.println("Max integer " + index);
    }

    /**
     * Create an application that simulates dice rolling.
     * <p>
     * Ask the user to enter the number of sides for a pair of dice.
     * Prompt the user to roll the dice.
     * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
     * Use static methods to implement the method(s) that generate the random numbers.
     * Use the .random method of the java.lang.Math class to generate random numbers.
     * Game Development 101
     **/


    public static void rollDice() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of sides ");

        String answer;
        String continuePlaying = "Y";
        //System.out.println(input.nextLine());

        if (input.hasNextInt()) {
            String strSides = input.nextLine().trim();
            System.out.println(strSides);
            int numberSides =  Integer.parseInt(strSides);

            int dice1 = 0;
            int dice2 = 0;

            do {
                System.out.println("\n Do you want to roll the dice?");

                answer = input.nextLine();
                System.out.println("answer " + answer);
                if (answer.equalsIgnoreCase("Y")) {

//                    Random rand = new Random();
//                    dice1 = rand.nextInt(numberSides) + 1;
//                    dice2 = rand.nextInt(numberSides) + 1;

                    // Cast them to int because random returns a double
                    //
                    dice1 = (int)(Math.random() * numberSides) + 1;
                    dice2 = (int)(Math.random() * numberSides) + 1;
                    System.out.format("dice 1 =  %d dice 2 =  %d", dice1, dice2);

                } else {

                    continuePlaying = "N";
                    break;
                }

            } while (continuePlaying.equalsIgnoreCase("Y"));
        }
        else {
            rollDice();
        }

    }

}