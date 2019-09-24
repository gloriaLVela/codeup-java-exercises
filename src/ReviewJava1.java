public class ReviewJava1 {
    public static void main(String[] args) {

        int stopValue = 50;
        int i = 1;
        fizzBuzzRecursive(i, stopValue);

    }

    public static void fizzBuzzRecursive(int i, int stopValue) {

        if (i == stopValue) {
            return;
        }

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
       // i++;
        fizzBuzzRecursive(i + 1, stopValue);
    }
}
