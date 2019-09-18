import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        /**
         *
         *
         * Create a class named StringExercise with a main method.
         *
         * For each of the following output examples: create a String variable named message that contains the desired output and print it out to the console.
         *
         * Do this with only one String variable and one print statement.
         *
         *
         * We don't need no education
         * We don't need no thought control
         *
         * Check "this" out!, "s inside of "s!
         *
         * In windows, the main drive is usually C:\
         *
         * I can do backslashes \, double backslashes \\,
         * and the amazing triple backslash \\\!**/

        String message = "";

        System.out.println("\n\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the maximum");

        int maximum = Integer.parseInt(input.nextLine());

        for (var index = 1; index <= maximum; index++){
            switch (index % 3) {
                case 1:
                    message = " We don't need no education\n We don't need no thought control";
                    break;
                case 2:
                    message = "Check \"this\" out!, \"s inside of \"s!";
                    break;
                default:
                    message = "I can do backslashes \\, double backslashes \\\\,\n" +
                            "and the amazing triple backslash \\\\\\!\n\n";
                    break;
            }

            System.out.println(message);
        }


    }
}
