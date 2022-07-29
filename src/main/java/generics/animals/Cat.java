package generics.animals;

public class Cat extends Animal implements AnimalTypes {

    public Cat(String name) {
        super(name);
    }

    public void doCatStuff() {
        System.out.println("Cat doing Cat Stuff!");
    }

    @Override
    public String getMyType() {
        return "Mammal";
    }
}
