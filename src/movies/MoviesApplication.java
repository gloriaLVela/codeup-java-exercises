package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    private static Movie[] movieArray = MoviesArray.findAll();
    private static Input keyboard = new Input();

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


        String movieName;
        String movieCategory;

        //boolean done = false;

        int choice = 9;

        while (choice != 0) {

            choice = keyboard.getInt("\n What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a movie\n" +
                    "\n" +
                    "Enter your choice:", 0, 6);

            System.out.println("choice = " + choice);
            processChoice(choice);

        }
    }

    private static boolean processChoice(int choice) {
        boolean option = true;
        //Movie newMovie;

        // switch statement
        switch (choice) {
            case 0:
                System.out.println("Have a good day!");
                option = false;
                break;
            // All movies
            case 1:
                displayMovies();
                break;

            case 2:
                // animated
                displayMovies("animated");
                break; // break is optional

            case 3:
                // drama
                displayMovies("drama");
                break; // break is optional
            case 4:
                // horror
                displayMovies("horror");
                break; // break is optional
            case 5:
                // sci-fi

                displayMovies("scifi");
                break; // break is optional
            case 6:

                String movieName = keyboard.getString("Please enter the movie name");
                String movieCategory = keyboard.getString("Please enter the movie category");
                Movie newMovie = new Movie(movieName, movieCategory);
                Movie[] newList = Arrays.copyOf(movieArray, movieArray.length + 1);
                newList[newList.length - 1] = newMovie;
                movieArray = newList;
            default:
                // Statements
        }
        return option;

    }

    /**
     * Display movies
     */
    private static void displayMovies() {
        for (Movie movie : movieArray) {
            System.out.println(movie.getMovieInfo());
        }
    }

    private static void displayMovies(String currentChoice) {
        for (Movie movie : movieArray) {
            if (movie.getCategory().equalsIgnoreCase(currentChoice)) {
                System.out.println(movie.getMovieInfo());
            }
        }
    }
}
