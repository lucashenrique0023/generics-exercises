package generics.animals;

public abstract class Animal {

    String name;

    public Animal(String name) { this.name = name; }

    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
