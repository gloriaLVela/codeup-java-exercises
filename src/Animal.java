public class Animal {

    private int age;
    private String species;
    private boolean isAlive;

    public Animal(int age, String species, boolean isAlive) {
        this.age = age;
        this.species = species;
        this.isAlive = isAlive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
