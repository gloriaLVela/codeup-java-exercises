public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");





        /**
         *
         *
         * Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
         *
         */

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        /**
         *
         * Create a String variable named myString and assign a string value to it, then print the variable out to the console.
         */

        String myString = "Hello";

        System.out.println(myString);

        /**
         * Change your code to assign a character value to myString. What do you notice?
         */

//        myString = 'a';
//
//        System.out.println(myString);

        /**
         * Change your code to assign the value 3.14159 to myString. What happens?
         */

//        myString = 3.14159;


        /**
         * Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
         */
        long myNumber;
        //System.out.print(myNumber); Variable not initialized

        /**
         * Change your code to assign the value 3.14 to myNumber. What do you notice?
         */

        //myNumber = 3.14;
        //System.out.print(myNumber); Incompatible types

        /**
         * Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
         */

        myNumber = 123L;
        System.out.println(myNumber);

        /**
         * Change your code to assign the value 123 to myNumber.
         */
        myNumber = 123;
        System.out.println(myNumber);

        /**
         * Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
         */

        // The variable is integer

        /**
         * Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
         */

        //float myNumber2 = 3.14; Incompatible types

        //System.out.println(myNumber2);

        /**
         * Copy and paste the following code blocks one at a time and execute them
         *
         */

//         int x = 5;
//         System.out.println(x++);
//         System.out.println(x);

//         int x = 5;
//         System.out.println(++x);
//         System.out.println(x);


         /**
         * What is the difference between the above code blocks? Explain why the code outputs what it does.
         *
         * Try to create a variable named class. What happens?
         *
         * Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
         *
         */

//         String theNumberThree = "three";
//         Object o = theNumberThree;
//         int three = (int) o;
//
//         Note : class java.lang.String cannot be cast to class java.lang.Integer


         /** Copy and paste the code above and then run it. Does the result match with your expectation?
         *
         * How is the above example different from the code block below?
         *
         */


//         int three = (int) "three";
//
//         System.out.println(three );
//
//         Note: incompatible types



         /**
         * What are the two different types of errors we are observing?
         *
         * Rewrite the following expressions using the relevant shorthand assignment operators:
         *
         */

//
//         int x = 4;
//         //x = x + 5;
//        x += 5;

//         int x = 3;
//         int y = 4;
//         y *= x;
//
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;


         System.out.println(x);
        System.out.println(y);



         /**
         * What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
          * What happens if you increment a numeric variable past the type's capacity?
         *
         * Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
         */
    }
}
