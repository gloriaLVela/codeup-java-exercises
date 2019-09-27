import util.Input;

import java.util.*;


public class BonusMethods {
    public static void main(String[] args) {
        countVowels("The cat and the dog");
        System.out.println("   ");
        printLine("Print this line");
        System.out.println("   ");
    }

    /**
     * Extra Methods Exercises
     * Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
     * <p>
     * For example:
     * <p>
     * countVowels("cat")
     * Should output:
     * <p>
     * |======== VOWEL COUNT ========|
     * | A's | E's | I's | O's | U's |
     * | 1   | 0   | 0   | 0   | 0   |
     * |=============================|
     * The countVowels method uses the following methods to produce it's output:
     * <p>
     * countAs()
     * countEs()
     * countIs()
     * countOs()
     * countUs()
     **/
    public static void countVowels(String inputSentence) {
        {
            int[] countVowels = new int[5];
            //inputSentence = inputSentence.toLowerCase();
            for (int i = 0; i < inputSentence.length(); i++) {
                // switch statement
                switch (inputSentence.toLowerCase().charAt(i)) {
                    // case statements
                    // values must be of same type of expression
                    case 'a':
                        countVowels[0]++;

                        break; // break is optional

                    case 'e':
                        countVowels[1]++;
                        break; // break is optional
                    case 'i':
                        countVowels[2]++;
                        break; // break is optional

                    case 'o':
                        countVowels[3]++;
                        break; //
                    case 'u':
                        countVowels[4]++;
                        break;
                    default:
                        // Statements
                }
            }
            System.out.format("\ninputSentence = %s\n\n", inputSentence);
            System.out.println("|======== VOWEL COUNT ========|");
            System.out.println("| A's | E's | I's | O's | U's |");
            System.out.printf("| %d   | %d   | %d   | %d   | %d   |\n", countVowels[0], countVowels[1], countVowels[2], countVowels[3], countVowels[4]);
            System.out.println("|=============================|");
            //System.out.println("There are " + Arrays.toString(countVowels) + " vowels ");
        }
    }


    /**
     * Create a method that will return how many capital letters are in a string.
     *
     * Create a method, getType() that will take in an input and return a string describing the type of the value. Account for int, boolean, String, char, and double. Use method overloading.
     *
     * Create a method to print out every letter in a string using recursion.
     *
     * **/

    public static void printLine(String input){
        if (input.length() == 0) {
            return;
        }
        System.out.print(input.charAt(0));
        printLine(input.substring(1));
    }

    /**
     *
     * Create a method to determine if a string is a palindrome.
     *
     * Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
     *
     * Create a command line calculator
     *
     * the user may enter a number
     * the user may enter an operator
     * the user may enter a second number
     * the program should output a result, then prompt the user for another calculation
     * Build a time conversion application:
     *
     * The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
     *
     * Time conversion (part 2)
     *
     * Create a method which accepts dates in the following format:
     *
     * mm/dd/yyyy
     * and returns a string with this format:
     *
     * monthname, day, year
     * example:
     *
     * input: 12/01/1999
     * output: December 12, 1999
     * Time conversion (part 3)
     *
     * Lookup the Date class in Java and use it to rewrite your previous time conversion applications.
     *
     * Create a command line Hangman game:
     *
     * The game should prompt player 1 for a word. Player 2 (p2) has 9 guesses to correctly identify the word.
     *
     * Each round, display to the user:
     *
     * The current visible letters of the word
     * The letters already incorrectly guessed
     * The number of guesses remaining
     * Further Specifications:
     *
     * At any round, the user may guess a letter or multiple letters to complete the word
     * If p2 guesses correctly, they WIN! and are asked if they want to play again
     * If p2 guesses wrong, they LOSE!
     * If p2 runs out of guesses, they LOSE!
     * Create date format converter application.
     *
     * Take in the following format:
     *
     * MM/DD/YYYY
     * Output the following:
     *
     * MonthName DD, YYYY
     * Example:
     *
     * input - 12/01/1999 output - December 12, 1999
     *
     * Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
     * Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
     * Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
     * Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
     * Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
     * Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
     * Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
     * Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
     * Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
     * Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
     * Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
     * Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
     * Write a solution to FizzBuzz using recursion instead of a loop.
     * Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
     * Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
     * Write a method called coinFlip that randomly returns a true or false value.
     * Write a method named randomWalk that takes in an integer and returns a string of that many random ones and zeros. Example: randomWalk(1) returns a string with one character that is randomly 0 or 1. randomWalk(33) returns a string with 33 random 1s or 0s.
     * Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones.
     * Write a method named countZeros that takes in a string of ones and zeroes and returns a count of the 0s.
     * Write a method named analyzeRandomWalk that accepts a string containing ones and zeroes and prints out the number of ones and the number of zeroes. This method is void because it does not return anything. Example: analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
     * Write a method named longestRun that accepts a string of ones and zeroes and returns an integer that specifies the longest consecutive sequence of either 0s or 1s. Example: longestRun("1001111100") returns 5 because there are 5 ones in a row. longestRun("01001") returns 2 because there are two consecitive zeroes.
     * Write a method named secondLongestRun that accepts a string of 1s and 0s and returns an integer that specifies the length of the second longest run of consecutive numbers. Example secondLongestRun("111001") returns 2 because the two 0s in a row are the second longest run.
     * Write a method named magic8ball that prompts the user to input a question. If the user inputs a string that does not have a question mark at the end, then start the method over again. When answering the magic 8 ball randomly returns one of a set of string options like the following:
     * "All signs point to yes", "The future is cloudy. Ask again", "Very doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on it!", "Ask again later."
     * Write a method named dndDiceRoll that accepts a string of the format "2d6" where the first number(s) are the number of dice and the second number is the number of sides of each of those dice. Example: "5d4" rolls a four sided die 5 times and returns the sum of the result.
     * Write a method named l5rDiceRoll that accepts a string of the following format "6k4" where the first number is the number of dice to roll, the second number is the number of dice we keep the highest values from, and each die has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of keeping the highest 2 rolls.
     */
}

/**
 * Extra Methods Exercises
 * Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
 * <p>
 * For example:
 * <p>
 * countVowels("cat")
 * Should output:
 * <p>
 * |======== VOWEL COUNT ========|
 * | A's | E's | I's | O's | U's |
 * | 1   | 0   | 0   | 0   | 0   |
 * |=============================|
 * <p>
 * <p>
 * The countVowels method uses the following methods to produce it's output:
 * <p>
 * countAs()
 * countEs()
 * countIs()
 * countOs()
 * countUs()
 * Create a method that will return how many capital letters are in a string.
 * <p>
 * Create a method, getType() that will take in an input and return a string describing the type of the value. Account for int, boolean, String, char, and double. Use method overloading.
 * <p>
 * Create a method to print out every letter in a string using recursion.
 * <p>
 * Create a method to determine if a string is a palindrome.
 * <p>
 * Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
 * <p>
 * Create a command line calculator
 * <p>
 * the user may enter a number
 * the user may enter an operator
 * the user may enter a second number
 * the program should output a result, then prompt the user for another calculation
 * Build a time conversion application:
 * <p>
 * The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
 * <p>
 * Time conversion (part 2)
 * <p>
 * Create a method which accepts dates in the following format:
 * <p>
 * mm/dd/yyyy
 * and returns a string with this format:
 * <p>
 * monthname, day, year
 * example:
 * <p>
 * input: 12/01/1999
 * output: December 12, 1999
 * Time conversion (part 3)
 * <p>
 * Lookup the Date class in Java and use it to rewrite your previous time conversion applications.
 * <p>
 * Create a command line Hangman game:
 * <p>
 * The game should prompt player 1 for a word. Player 2 (p2) has 9 guesses to correctly identify the word.
 * <p>
 * Each round, display to the user:
 * <p>
 * The current visible letters of the word
 * The letters already incorrectly guessed
 * The number of guesses remaining
 * Further Specifications:
 * <p>
 * At any round, the user may guess a letter or multiple letters to complete the word
 * If p2 guesses correctly, they WIN! and are asked if they want to play again
 * If p2 guesses wrong, they LOSE!
 * If p2 runs out of guesses, they LOSE!
 * Create date format converter application.
 * <p>
 * Take in the following format:
 * <p>
 * MM/DD/YYYY
 * Output the following:
 * <p>
 * MonthName DD, YYYY
 * Example:
 * <p>
 * input - 12/01/1999 output - December 12, 1999
 * <p>
 * Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
 * Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
 * Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
 * Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
 * Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
 * Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
 * Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
 * Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
 * Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
 * Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
 * Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
 * Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
 * Write a solution to FizzBuzz using recursion instead of a loop.
 * Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
 * Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
 * Write a method called coinFlip that randomly returns a true or false value.
 * Write a method named randomWalk that takes in an integer and returns a string of that many random ones and zeros. Example: randomWalk(1) returns a string with one character that is randomly 0 or 1. randomWalk(33) returns a string with 33 random 1s or 0s.
 * Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones.
 * Write a method named countZeros that takes in a string of ones and zeroes and returns a count of the 0s.
 * Write a method named analyzeRandomWalk that accepts a string containing ones and zeroes and prints out the number of ones and the number of zeroes. This method is void because it does not return anything. Example: analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
 * Write a method named longestRun that accepts a string of ones and zeroes and returns an integer that specifies the longest consecutive sequence of either 0s or 1s. Example: longestRun("1001111100") returns 5 because there are 5 ones in a row. longestRun("01001") returns 2 because there are two consecitive zeroes.
 * Write a method named secondLongestRun that accepts a string of 1s and 0s and returns an integer that specifies the length of the second longest run of consecutive numbers. Example secondLongestRun("111001") returns 2 because the two 0s in a row are the second longest run.
 * Write a method named magic8ball that prompts the user to input a question. If the user inputs a string that does not have a question mark at the end, then start the method over again. When answering the magic 8 ball randomly returns one of a set of string options like the following:
 * "All signs point to yes", "The future is cloudy. Ask again", "Very doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on it!", "Ask again later."
 * Write a method named dndDiceRoll that accepts a string of the format "2d6" where the first number(s) are the number of dice and the second number is the number of sides of each of those dice. Example: "5d4" rolls a four sided die 5 times and returns the sum of the result.
 * Write a method named l5rDiceRoll that accepts a string of the following format "6k4" where the first number is the number of dice to roll, the second number is the number of dice we keep the highest values from, and each die has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of keeping the highest 2 rolls.
 */


/**
 * The countVowels method uses the following methods to produce it's output:
 *
 * countAs()
 * countEs()
 * countIs()
 * countOs()
 * countUs()
 * Create a method that will return how many capital letters are in a string.
 *
 * Create a method, getType() that will take in an input and return a string describing the type of the value. Account for int, boolean, String, char, and double. Use method overloading.
 *
 * Create a method to print out every letter in a string using recursion.
 *
 * Create a method to determine if a string is a palindrome.
 *
 * Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
 *
 * Create a command line calculator
 *
 * the user may enter a number
 * the user may enter an operator
 * the user may enter a second number
 * the program should output a result, then prompt the user for another calculation
 * Build a time conversion application:
 *
 * The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
 *
 * Time conversion (part 2)
 *
 * Create a method which accepts dates in the following format:
 *
 * mm/dd/yyyy
 * and returns a string with this format:
 *
 * monthname, day, year
 * example:
 *
 * input: 12/01/1999
 * output: December 12, 1999
 * Time conversion (part 3)
 *
 * Lookup the Date class in Java and use it to rewrite your previous time conversion applications.
 *
 * Create a command line Hangman game:
 *
 * The game should prompt player 1 for a word. Player 2 (p2) has 9 guesses to correctly identify the word.
 *
 * Each round, display to the user:
 *
 * The current visible letters of the word
 * The letters already incorrectly guessed
 * The number of guesses remaining
 * Further Specifications:
 *
 * At any round, the user may guess a letter or multiple letters to complete the word
 * If p2 guesses correctly, they WIN! and are asked if they want to play again
 * If p2 guesses wrong, they LOSE!
 * If p2 runs out of guesses, they LOSE!
 * Create date format converter application.
 *
 * Take in the following format:
 *
 * MM/DD/YYYY
 * Output the following:
 *
 * MonthName DD, YYYY
 * Example:
 *
 * input - 12/01/1999 output - December 12, 1999
 *
 * Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
 * Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
 * Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
 * Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
 * Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
 * Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
 * Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
 * Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
 * Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
 * Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
 * Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
 * Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
 * Write a solution to FizzBuzz using recursion instead of a loop.
 * Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
 * Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
 * Write a method called coinFlip that randomly returns a true or false value.
 * Write a method named randomWalk that takes in an integer and returns a string of that many random ones and zeros. Example: randomWalk(1) returns a string with one character that is randomly 0 or 1. randomWalk(33) returns a string with 33 random 1s or 0s.
 * Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones.
 * Write a method named countZeros that takes in a string of ones and zeroes and returns a count of the 0s.
 * Write a method named analyzeRandomWalk that accepts a string containing ones and zeroes and prints out the number of ones and the number of zeroes. This method is void because it does not return anything. Example: analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
 * Write a method named longestRun that accepts a string of ones and zeroes and returns an integer that specifies the longest consecutive sequence of either 0s or 1s. Example: longestRun("1001111100") returns 5 because there are 5 ones in a row. longestRun("01001") returns 2 because there are two consecitive zeroes.
 * Write a method named secondLongestRun that accepts a string of 1s and 0s and returns an integer that specifies the length of the second longest run of consecutive numbers. Example secondLongestRun("111001") returns 2 because the two 0s in a row are the second longest run.
 * Write a method named magic8ball that prompts the user to input a question. If the user inputs a string that does not have a question mark at the end, then start the method over again. When answering the magic 8 ball randomly returns one of a set of string options like the following:
 * "All signs point to yes", "The future is cloudy. Ask again", "Very doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on it!", "Ask again later."
 * Write a method named dndDiceRoll that accepts a string of the format "2d6" where the first number(s) are the number of dice and the second number is the number of sides of each of those dice. Example: "5d4" rolls a four sided die 5 times and returns the sum of the result.
 * Write a method named l5rDiceRoll that accepts a string of the following format "6k4" where the first number is the number of dice to roll, the second number is the number of dice we keep the highest values from, and each die has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of keeping the highest 2 rolls.
 *
 */
