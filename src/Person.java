public class Person {

//    private String firstName;
//    private String lastName;
    private String name;

    public static void main(String[] args) {

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        // Checks for the value
//        System.out.println(person1.getName().equals(person2.getName()));
//        // There are two different objects
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        // True because it copies the reference of the object
//        System.out.println(person1 == person2);


        Person person1 = new Person("John");
        // Copies the reference
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    public Person(String newName){
        name = newName;
    }

    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello()
    {
        System.out.format("Hello this is %", this.name);
    }


}
