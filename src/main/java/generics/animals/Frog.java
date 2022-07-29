package generics.animals;

import java.io.Serializable;

public class Frog extends Animal implements AnimalTypes {

    public Frog(String name) {
        super(name);
    }

    public void doDogStuff() {
        System.out.println("Frog doing Frog Stuff!");
    }

    @Override
    public String getMyType() {
        return "Amphibian";
    }

}



