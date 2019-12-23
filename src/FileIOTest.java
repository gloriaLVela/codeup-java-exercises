import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIOTest {
    public static void main(String[] args) {

        try {System.out.println(returnString("dataLost", "superHeroes.txt"));}
        catch (IOException e) {
            e.printStackTrace();
        }

        try{
        System.out.println(returnString("data", "NosuperHeroes.txt"));}
        catch (IOException e) {
            e.printStackTrace();
        }

        try{

        System.out.println(returnString("data", "superHeroes.txt"));}
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Create a method for retrieving file contents.
     * <p>
     * The method should accept a string that is the location of the file, and return a list of strings where each string is a line in the file.
     */


    public static  List<String> returnString(String directory, String fileName) throws IOException {

        Path dataFile = Paths.get(directory, fileName);

        // Read file

        return Files.readAllLines(dataFile);

    }
}
