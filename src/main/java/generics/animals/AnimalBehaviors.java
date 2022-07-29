package generics.animals;

import java.io.Serializable;

/*
<T extends Animal> is a bounded Generic,
this means that we put a limit in our generic as Animal
Everything we pass through this class must have Animal methods implemented.

Notes:
- Both Classes and Interfaces use extends Keywords
- Class must be declared before interface, seens java does not have multiple heritage like:
    <T extends Animal & Interface & Interface>
 */
public class AnimalBehaviors<T extends Animal & AnimalTypes> {

    T animal;

    public AnimalBehaviors(T animal) {
        this.animal = animal;
    }

    public void eat() {
        animal.eat();
    }

    public void printName() {
        System.out.println(animal);
    }

    public void printType() {
        System.out.println(animal.getMyType());
    }

}
