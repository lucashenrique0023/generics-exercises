package generics.animals;

import generics.humans.Place;

/*
<T extends Animal> is a bounded Generic,
this means that we put a limit in our generic as Animal
Everything we pass through this class must have Animal methods implemented.

Notes:
- Both Classes and Interfaces use extends Keywords
- Class must be declared before interface, seens java does not have multiple heritage like:
    <T extends Animal & Interface & Interface>
- For multiple Generics, just separe with commma like: <T extends Animal & AnimalTypes, V extends Place>
 */
public class AnimalBehaviors<T extends Animal & AnimalTypes, V extends Place> {

    T animal;
    V place;

    public AnimalBehaviors(T animal, V place) {
        this.animal = animal;
        this.place = place;
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

    // Imagine Animals talks haha
    public void talk() {
        System.out.println(place.getName() + " is my favorite place!");
    }

}
