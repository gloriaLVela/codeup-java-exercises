import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        /**
         * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
         *
         * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
         * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
         * He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
         * He answers 'Whatever.' to anything else.
         * Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
         */

        String question = "How are you?";

        Scanner input = new Scanner(System.in);

            for (int index = 1; index < 5; index++){
                if (question.endsWith("?")){
                    System.out.println("Sure.");
                } else if (question.indexOf("!") >= 0){
                    System.out.println("Whoa, chill out!");
                } else if (question.isEmpty()){
                    System.out.println("Fine. Be that way!");
                } else
                { System.out.println("Whatever.");}


                System.out.println("Ask a question");
                question = input.nextLine();
        }
    }
}
