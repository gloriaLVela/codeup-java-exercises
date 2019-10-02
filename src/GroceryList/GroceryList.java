package GroceryList;

public class GroceryList {

    /**
     *
     * Create a grocery list command line application. You will use your input class from previous exercises.
     *
     * A user should be prompted if they would like to create a grocery list.
     *
     * If they pick yes, they will be prompted if they would like to enter a new item.
     *
     * If the users picks yes, they should be given the following three prompts:
     *
     * Given an ordered list of grocery categories to choose from, select the category.
     * Enter name of the item.
     * Enter how many of the item.
     * The user will then be given the choice to finalize the list or add an additional item.
     *
     * Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
     *
     * For an extra bonus, allow users to filter the results by only one category of items at a time.
     *
     * For a super gold star bonus, allow users to edit the list items.
     *
     * Consider before coding how the data should be organized. Using ArrayLists and HashMaps will be helpful.
     *
     * There is a new bit of syntax is how Java defines generics, which let us specify a type for another container class to hold. We won't go into too much detail on generics, but the short explanation is that they allow us make sure all our operations are type-safe, without having to create separate classes for an ArrayList of Integers, an ArrayList of Doubles, an ArrayList of Booleans, and so on. Instead we define one generic class. ↩
     *
     * Because collection elements must be objects, not primitive types, Java provides us with "wrapper" classes around the primitive types that essentially turn them into objects. The Integer class you see above is one example, and there are similar classes for the other primitive types.
     *
     * Usually you won't have to worry about the details of converting back and forth between, for example, an int or an Integer as Java takes care of this for us through a process known as autoboxing and unboxing.
     *
     * When you use a primitive type with one of Java's collection classes, just be sure to use the class (Integer), and not the primtive type (int). ↩
     */
}
