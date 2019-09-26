package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] movieArray = MoviesArray.findAll();

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
                    "Enter your choice:");

            System.out.println("choice = " + choice);

            if (choice == 0) {
                System.out.println("Have a good day!");
                break;

            } else if (choice == 6) {
                movieName = keyboard.getString("Please enter the movie name");
                movieCategory = keyboard.getString("Please enter the movie category");
                Movie newMovie = new Movie(movieName, movieCategory);
                Movie[] newList = Arrays.copyOf(movieArray, movieArray.length + 1);
                newList[newList.length - 1] = newMovie;
                movieArray = newList;
            } else {
                for (Movie movie : movieArray) {
                    // switch statement
                    switch (choice) {
                        // All movies
                        case 1:
                            System.out.println(movie.getName());
                            break;

                        case 2:
                            // animated
                            if (movie.getCategory().equalsIgnoreCase("animated")) {
                                System.out.println(movie.getName());
                            }
                            break; // break is optional

                        case 3:
                            // dramae
                            if (movie.getCategory().equalsIgnoreCase("drama")) {
                                System.out.println(movie.getName());
                            }
                            break; // break is optional
                        case 4:
                            // horror
                            if (movie.getCategory().equalsIgnoreCase("horror")) {
                                // System.out.println(movie.getCategory());
                                System.out.println(movie.getName());
                            }
                            break; // break is optional
                        case 5:
                            // sci-fi
                            if (movie.getCategory().equalsIgnoreCase("scifi")) {
                                System.out.println(movie.getName());
                            }
                            break; // break is optional
                        default:
                            // Statements
                    }

                }


            }
        }

    }
}
