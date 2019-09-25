import java.util.Random;

public class ServerNameGenerator {

    /**
     * Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
     * Create a method that will return a random element from an array of strings.
     * Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
     * Example Output
     * <p>
     * <p>
     * Here is your server name:
     * dedicated-photon
     */


    public static void main(String[] args) {
        String[] adjectiveList = {"amazing", "awkward", "aware", "bold", "clever", "classic", "complex", "colossal", "tiny", "damaged"};
        String[] nounList = {"house", "cat", "river", "box", "penny", "city", "mouse", "potato", "fish", "jeans"};


        System.out.println(randomString(adjectiveList) + "-" + randomString(nounList));

    }

    public static String randomString(String[] inputArray){
        int randomNumber;
        Random random = new Random();

        randomNumber = random.nextInt(inputArray.length);

        return inputArray[randomNumber];
    }
}
