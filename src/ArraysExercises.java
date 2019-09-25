import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        /**
         * What happens when you run the following code? Why is Arrays.toString necessary?
         *
         * Answer - display the reference to numbers because an array is an object
         *
         * Arrays.toString displays the value of the elements in the array if the array is basic type
         */
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));

        /**
         *
         * Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
         *
         *
         * **/

        Person[] persons = new Person[3];

        persons[0] = new Person("John");
        persons[1] = new Person("Paul");
        persons[2] = new Person("Ringo");

        for(Person person : persons){
            System.out.println(person.getName());
        }

        Person George = new Person("George");
        persons = addPerson(persons, George);

        System.out.format("\nNew Array\n\n");

        for(Person person : persons){
            System.out.println(person.getName());
        }


        /**
         * Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
         */
    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        /**
         * Copy the array
         */

        Person[] newList = Arrays.copyOf(people, people.length+1);
        newList[newList.length-1] = newPerson;
        return newList;
        //people = Arrays.copyOf(newList, newList.length+1);


    }
}
