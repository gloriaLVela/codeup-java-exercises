import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoLecture {

    public static void main(String[] args) {

        // ============================ PATH

//        Path fileLecturePath = Paths.get("src", "FileIoLecture.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "FileIoLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS

//        System.out.println(Files.exists(fileLecturePath));
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        System.out.println(dataDirectory);
//        System.out.println(dataFile);
//
//        if (!Files.exists(dataDirectory)) {
//
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
////
//        }

//        if (!Files.exists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//
//        // ============================ READING FILES
//
//        Path p = Paths.get("src/lec/test.txt");
//
//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }
//




//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }

//        try {
//            List<String> contents = Files.readAllLines(Paths.get("data/info.txt"));
//            System.out.println(contents.toString());
//        } catch (IOException e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }


        // ============================ WRITING FILES

//        Path p = Paths.get("src/lec/test.txt");
//
//        List<String> newNames = Arrays.asList("John", "Fred", "asdf");
//        try {
//            Files.write(p, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//            Path p = Paths.get("./src/lec",  "test.txt");
//
//            List<String> names = new ArrayList<>();
//            names.add("Tim");
//            names.add("Sally");
//            names.add("Mary");
//            try {
//                Files.write(p, names, StandardOpenOption.APPEND);
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//
//            String directory = "data";
//            String filename = "info.txt";
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
//            List<String> nums = new ArrayList<>();
//            nums.add("1");
//            nums.add("2");
//            nums.add("3");
//
//            try {
//                Files.write(dataFile, nums, StandardOpenOption.APPEND);
//            } catch(IOException e) {
//                System.out.println("Exception!!!");
//                e.printStackTrace();
//            }

        // ============================ ADDITIONAL SLIDE EXAMPLES


        // Print out each line in an existing file, along with the line number

//        Path groceriesPath = Paths.get("data", "groceries.txt");
//        List<String> groceryList = null;
//        try {
//            groceryList = Files.readAllLines(groceriesPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }


        // Add a line to an existing file

//        try {
//            Files.write(
//                    Paths.get("data", "groceries.txt"),
//                    Arrays.asList("eggs", "bread", "milk") // list with one item
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Replace "milk" with "cream"

//        List<String> lines = null;
//        try {
//            lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        List<String> newList = new ArrayList<>();
//        for (String line : lines) {
//            if (line.equals("bread")) {
//                newList.add("starch");
//                continue;
//            }
//            newList.add(line);
//        }
//
//        System.out.println(newList);
//
//        try {
//            Files.write(Paths.get("data", "groceries.txt"), newList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}

