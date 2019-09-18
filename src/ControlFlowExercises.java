import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /**
         * Loop Basics
         *
         * While
         *
         * Create an integer variable i with a value of 5.
         * Create a while loop that runs so long as i is less than or equal to 15
         * Each loop iteration, output the current value of i, then increment i by one.
         * Your output should look like this:
         *
         * 5 6 7 8 9 10 11 12 13 14 15
         */

        System.out.println("\n\n Create a while loop that runs so long as i is less than or equal to 15");

        byte maximum = 5;
        while (maximum <= 15) {
            System.out.print(maximum + " ");
            maximum++;
        }
        /**
         * Do While
         *
         * Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.**/
        System.out.println("\n\nCreate a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line");
        int x = 0;
        do {
            System.out.println(x);
            x += 2;

        } while (x <= 100);


        /**
         * Alter your loop to count backwards by 5's from 100 to -10.**/
        System.out.println("\n\nAlter your loop to count backwards by 5's from 100 to -10");
        int y = 100;
        do {
            System.out.println(y);
            y -= 5;

        } while (y >= -10);

        /**
         * Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
         *
         *  2
         *  4
         *  16
         *  256
         *  65536
         *  **/

        System.out.println("\n\n Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. ");
        long binaryCount = 2;
        do {
            System.out.println(binaryCount);
            binaryCount *= binaryCount;
        } while (binaryCount < 1000000);

        /**
         * For
         *
         * Refactor the previous two exercises to use a for loop instead.
         * 5 6 7 8 9 10 11 12 13 14 15
         *
         *
         * *  2
         *          *  4
         *          *  16
         *          *  256
         *          *  65536
         * **/

        System.out.println("\n\nRefactor the previous two exercises to use a for loop instead A 100 -10");
        for (var i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }


        System.out.println("\n\nRefactor the previous two exercises to use a for loop instead B");

        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }

        /**
         * Fizzbuzz
         *
         * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
         *
         * Write a program that prints the numbers from 1 to 100.
         * For multiples of three: print “Fizz” instead of the number.
         * For the multiples of five: print “Buzz”.
         * For numbers which are multiples of both three and five: print “FizzBuzz”.
         *
         * **/

        System.out.println("\n\n Fizzbuzz");
        for (var i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(' ');
            } else {
                System.out.println(i);
            }

        }

        /**
         * Display a table of powers.
         *
         * Prompt the user to enter an integer.
         * Display a table of squares and cubes from 1 to the value entered.
         * Ask if the user wants to continue.
         *
         *
         * Assume that the user will enter valid data.
         * Only continue if the user agrees to.
         * Example Output
         *
         *
         * What number would you like to go up to? 5
         *
         * Here is your table!
         *
         * number | squared | cubed
         * ------ | ------- | -----
         * 1      | 1       | 1
         * 2      | 4       | 8
         * 3      | 9       | 27
         * 4      | 16      | 64
         * 5      | 25      | 125
         *
         * **/


        System.out.println("\n\nDisplay a table of powers.");
        String playAgain = "Y";
        Scanner input = new Scanner(System.in);

        long squareValue = 0;
        long cubeValue = 0;

        while (playAgain.equalsIgnoreCase("Y")) {
            System.out.println("Please enter a number");
            int num = Integer.parseInt(input.nextLine());
            System.out.println("number      |squared        | cubed");
            System.out.println("------------|---------------| -----");
            for (var i = 1; i <= num; i++) {
                squareValue = (long) Math.pow(i, 2);
                cubeValue = (long) Math.pow(i, 3);
                System.out.format("%d  \t\t\t| %d  \t\t\t| %d", i, squareValue, cubeValue);
                System.out.println(' ');

            }
            System.out.println("\n\n Do you want to play again? Y / N ");
            playAgain = input.nextLine();
            //System.out.println(playAgain);

        }

        System.out.println("Have a nice day!");


        /**
         * Convert given number grades into letter grades.
         *
         * Prompt the user for a numerical grade from 0 to 100.
         * Display the corresponding letter grade.
         * Prompt the user to continue.
         * Assume that the user will enter valid integers for the grades.
         * The application should only continue if the user agrees to.
         * Grade Ranges:
         *
         * A : 100 - 88
         * B : 87 - 80
         * C : 79 - 67
         * D : 66 - 60
         * F : 59 - 0
         *
         * **/

        System.out.println("\n\nConvert given number grades into letter grades");
        String keepPlaying = "Y";
        String letterGrande = "A";

       // while (keepPlaying.equalsIgnoreCase("Y"));
        {

            System.out.println("Please enter a grade");

            int grade = Integer.parseInt(input.nextLine());

            if (grade >= 100 && grade <= 88) {
                letterGrande = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrande = "B";
            } else  if (grade >= 67 && grade <= 79) {
                letterGrande = "C";
            } else  if (grade >= 60 && grade <= 66) {
                letterGrande = "D";
            } else  if (grade >= 0 && grade <= 59) {
                letterGrande = "F";
            }


            System.out.println( letterGrande);

            //System.out.println("\n\n Do you want to play again? Y / N ");
           // keepPlaying = input.nextLine();
        }
        /**
         * Bonus
         *
         * Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
         */
    }
}
