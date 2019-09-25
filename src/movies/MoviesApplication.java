package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        /**
         Create a class named MoviesApplication that has a main method.
         * Give the user a list of options for viewing all the movies or viewing movies by category.
         * Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
         * If a category is selected, only movies from that category should be displayed.
         * Your application should continue to run until the user chooses to exit.
         * Sample Output
         *
         *
         * What would you like to do?
         *
         * 0 - exit
         * 1 - view all movies
         * 2 - view movies in the animated category
         * 3 - view movies in the drama category
         * 4 - view movies in the horror category
         * 5 - view movies in the scifi category
         *
         * Enter your choice: 1
         *
         */

        Input keyboard = new Input();

        int choice = keyboard.getInt("* What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice:");

        //System.out.println("choice = " + choice);

        if (choice == 0) {
            System.out.println("Have a good day!");
        } else {
            Movie[] movieArray = MoviesArray.findAll();
            for (Movie movie : movieArray) {
                // switch statement
                switch (choice) {
                    // case statements\
                    case 1:
                        System.out.println(movie.getName());
                        break;
                    // values must be of same type of expression
                    case 2:
                        // Statements
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName());
                        }
                        break; // break is optional

                    case 3:
                        // Statements
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName());
                        }
                        break; // break is optional
                    case 4:
                        // Statements
                        if (movie.getCategory().equalsIgnoreCase( "horror")) {
                            // System.out.println(movie.getCategory());
                            System.out.println(movie.getName());
                        }
                        break; // break is optional
                    case 5:
                        // Statements
                        if (movie.getCategory().equalsIgnoreCase( "scifi")) {
                            System.out.println(movie.getName());
                        }
                        break; // break is optional

                    // We can have any number of case statements
                    // below is default statement, used when none of the cases is true.
                    // No break is needed in the default case.
                    default:
                        // Statements
                }
                //System.out.println(movie.getName());
            }


        }


    }
}
