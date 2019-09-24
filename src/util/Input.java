package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main
     */


    public static void main(String[] args) {


        util.Input keyboard = new util.Input();


        System.out.println(keyboard.getString());

        System.out.println(keyboard.yesNo());

        System.out.println(keyboard.getInt(1, 5));

        System.out.println(keyboard.getInt());

        System.out.println(keyboard.getDouble(1, 5));

        System.out.println(keyboard.getDouble());

    }

    public String getString() {
        System.out.println("Please enter a sentence");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        /**
         * The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
         */
        System.out.println("Do you like movies?");
        String answer = scanner.nextLine();
        char firstChar = answer.trim().toLowerCase().charAt(0);
        if (firstChar == 'y') {
            return true;
        } else {
            return false;
        }

    }


    public int getInt(int min, int max) {
        /**
         *
         * The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
         */
        System.out.format("please enter a number between %d and %d \n", min, max);
        while (!scanner.hasNextInt()) {
            System.out.format("please enter a number between %d and %d \n", min, max);
            scanner.next();
        }
        int userInput = scanner.nextInt();

        //* If the input is invalid, prompt the user again.
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.format("The number %d is not between %d and %d \n", userInput, min, max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        /**
         * The getInt() method should keep prompting the user for input until they give an integer
         */
        System.out.println("please enter a number ");
        while (!scanner.hasNextInt()) {
            System.out.println("please enter a number ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        /**
         *
         * The getDouble(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
         */
        System.out.format("please enter a number between %.2f and %.2f \n", min, max);
        while (!scanner.hasNextDouble()) {
            System.out.format("please enter a number between %.2f and %.2f \n", min, max);
            scanner.next();
        }
        double userInput = scanner.nextDouble();

        //* If the input is invalid, prompt the user again.
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.format("The number %.2f is not between %.2f and %.2f \n", userInput, min, max);
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        /**
         * The getDouble() method should keep prompting the user for input until they give an double
         */
        System.out.println("please enter a decimal number ");
        while (!scanner.hasNextDouble()) {
            System.out.println("please enter a decimal number ");
            scanner.next();
        }
        return scanner.nextDouble();


    }

}

