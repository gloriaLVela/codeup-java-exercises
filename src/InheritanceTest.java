public class InheritanceTest {

    public static void main(String[] args) {
        /**
         * 
         * creating Dog objects, Animal objects, and changing the visibility of the various properties.
         */
        
        Dog fido = new Dog(2, "dog", true, "chihuahua", "Fido");
        System.out.println("fido = " + fido);

        Animal gato = new Animal(3,"cat", true);

        System.out.println(fido.getName());

//        System.out.println(gato.setAge(4));
        
    }
}
