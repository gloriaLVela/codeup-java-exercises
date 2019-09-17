import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        /**
         * Copy this code into your main method:
         *
         */

         double pi = 3.14159;
         /** Write some Java code that uses the variable pi to output the following:
         *
         *
         * The value of pi is approximately 3.14.
         * Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
         */

        System.out.println(pi);

        System.out.format("%.2f%n", pi);

        /**
        * Explore the Scanner Class.
        *
        * Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: \n");
        int num = scanner.nextInt();

        System.out.print("You entered: --> \"" + num + "\" <-- \n");

        /**
        *
        * What happens if you input something that is not an integer? -- Exception in thread "main" java.util.InputMismatchException
         *
         *
        * Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        */

        System.out.print("Please enter first word: \n");
        String firstWord = scanner.next();

        System.out.print("Please enter second: \n");
        String secondWord = scanner.next();

        System.out.print("Please enter third word: \n");
        String thirdWord = scanner.next();

        System.out.print("You entered: " + firstWord + "," + secondWord + "," + thirdWord + "\n");

        /**
        * What happens if you enter less than 3 words? Does not display anything until after the third value is entered
        * What happens if you enter more than 3 words?  A- You can't
        * Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        *
        * do you capture all of the words?
         */


        /**
        * Rewrite the above example using the nextLine method.
        */

        System.out.print("Please enter a sentence: ");
        String wholeSentence = scanner.nextLine();

        System.out.println("This is the whole sentence " + wholeSentence);

        /**
        * Calculate the perimeter and area of Codeup's classrooms.
        *
        * Prompt the user to enter values of length and width of a classroom at Codeup.
        */

        System.out.print("Please enter the length : \n");
        int length = scanner.nextInt();

        System.out.print("Please enter the width : \n");
        int width = scanner.nextInt();

        int area = width * length;

        System.out.format("%d%n", area);


        /**
        * Use the nextLine method to get user input and cast the resulting string to a numeric type.
        *
        * Assume that the rooms are perfect rectangles.
        * Assume that the user will enter valid numeric data for length and width.
        * Display the area and perimeter of that classroom.
        */
        System.out.print("Please enter the length : \n");
        String strLength = scanner.next();

        System.out.print("Please enter the width : \n");
        String strWidth = scanner.next();

        length = Integer.parseInt(strLength);

        width = Integer.parseInt(strWidth);

        area = width* length;

        int perimeter = 2 * length + 2 * width;

        System.out.format(" area is %d and the perimeter is %d \n", area, perimeter);


        /**
        * The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        *
        * Bonuses
        *
        * Accept decimal entries.
        * Calculate the volume of the rooms in addition to the area and perimeter.
        * The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
        */


        System.out.print("Please enter the length float : \n");
        float floatLength = scanner.nextFloat();

        System.out.print("Please enter the width float  : \n");
        float floatWidth = scanner.nextFloat();


        float floatArea = floatLength* floatWidth;

        float floatPerimeter = 2 * floatLength + 2 * floatWidth;

        System.out.print("Please enter the height \n");

        float floatHeight = scanner.nextFloat();

        float floatVolume = floatArea * floatHeight;

        System.out.format(" area is %.2f%n, the perimeter is %.2f%n and the volume is %.2f%n ", floatArea, floatPerimeter, floatVolume);

        /**
        *
        * scanner.useDelimiter("\n");
        * How does this change the way your program operates?
        *
        * Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
        */
    }
}
