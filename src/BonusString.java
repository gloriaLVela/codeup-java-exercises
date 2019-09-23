import java.util.Scanner;

public class BonusString {


    public static void main(String[] args) {
        /**
         *
         * ================================= JAVA STRING BONUSES
         *
         * ----BONUS 1
         *
         * Create date format converter application.
         * Take in the following format:
         *
         * MM/DD/YYYY
         *
         * Output the following:
         *
         * MonthName DD, YYYY
         *
         * Example:
         *
         * input - 12/01/1999
         * output - December 12, 1999
         *
         **/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date format MM/DD/YYYY");
        String inputDate = input.nextLine();


        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //System.out.println(months[0]);

        int month = Integer.parseInt(inputDate.substring(0, inputDate.indexOf("/"))) - 1;
        String strMonth = months[month];
        //System.out.println(strMonth);

        String outputDate = strMonth + " " + inputDate.substring(inputDate.indexOf("/") + 1, inputDate.lastIndexOf("/")) + ", " + inputDate.substring(inputDate.lastIndexOf("/") + 1);
        System.out.println(outputDate);

        /**
         * ----BONUS 2
         *
         * Create an application that allows the user to enter a sentence
         * and tells them how many vowels and consonants were used.
         *
         * Example:
         *
         * input - "The hill are alive."
         * output - 5 vowels and 10 consonants
         **/

        String vowels = "aeiouAEIOU";

        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        String letters = "aeiouAEIOUbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        System.out.println("Please enter a sentence");
        String inputSentence = input.nextLine();

        int vowelCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < inputSentence.length(); i++) {
            if (letters.indexOf(inputSentence.charAt(i)) >= 0) {
                if (vowels.indexOf(inputSentence.charAt(i)) >= 0) {
                    vowelCounter++;
                }
                if (consonants.indexOf(inputSentence.charAt(i)) >= 0) {
                    consonantCounter++;
                }
            }
        }
        System.out.println("There are " + vowelCounter + " vowels and " + consonantCounter + " consonants");

        /**
         *
         * ----BONUS 3
         *
         * Create a command line calculator application.
         *
         * The program should welcome the user, prompt them for a calculation,
         * and give the result. The user should be prompted after each result is
         * outputted if they want to enter another calculation. When they
         * say no, give them an exit message. Allow the user first to specify
         * how many operands they will enter. Do not worry about
         * input validation (assume user enters correct data type).
         *
         * Example program:
         *
         * ...
         *
         * WELCOME TO THE CALCULATOR APP!!! (program output)
         *
         * Do you wish to enter a new calculation? (program output)
         * yes (user inputs this)
         *
         * How many operands will you calculate? (program output)
         * 2 (user inputs this)
         *
         * Please enter a calculation: (program output)
         * 2 + 2 (user enters this or something like this)
         * The output of 2 + 2 is 4. (program outputs this)
         *
         * Do you wish to enter a new calculation? (program outputs this)
         * no (user enters this)
         *
         * GOODBYE!!!
         */

        System.out.println("WELCOME TO THE CALCULATOR APP!!! ");

        System.out.println("Do you wish to enter a new calculation? Y/ N ");

        String continuePlaying = input.nextLine();

        int totalOperands = 0;

        int operandCounter = 0;

        int result = 0;

        int currentNumber = 0;

        String currentOperator = "";


        String[] tempArray;


        while (continuePlaying.equalsIgnoreCase("Y")) {
            System.out.println("Do you wish to enter a new calculation? Y/ N ");
            continuePlaying = input.nextLine();

            System.out.println("How many operands will you calculate?");
            totalOperands = Integer.parseInt(input.nextLine());
            System.out.println("Please enter a calculation: ");
            String calculation = input.nextLine();

            /* given string will be split by the argument delimiter provided. */
            tempArray = calculation.split(" ");


            System.out.println("\n");

            /* print substrings */
            for (int i = 0; i < tempArray.length; i++) {
                //System.out.println(tempArray[i]);
                if (tempArray[i].equals("+") || tempArray[i].equals("-") || tempArray[i].equals("*") || tempArray[i].equals("/")) {
                    currentOperator = tempArray[i];
                } //if

                else {
                    if (operandCounter == 0) {
                        result = Integer.parseInt(tempArray[0]);
                    } else {
//                        System.out.println("Error " + tempArray[i] + " currentOperator " + currentOperator );
                        currentNumber = Integer.parseInt(tempArray[i]);

                        switch (currentOperator) {
                            case "+":
                                result = result + currentNumber;
                                break;
                            case "-":
                                result = result - currentNumber;
                                break;
                            case "*":
                                result = result * currentNumber;
                                break;
                            case "/":
                                result = result / currentNumber;
                                break;
                            default:
                                System.out.println("Default case");
                                break;
                        }
                        System.out.println(result);
                    }


                }
                operandCounter++;
            } // for loop


            System.out.println("The output of " + calculation + " = " + result);
            result = 0;
            operandCounter = 0;


        }
    }
}
