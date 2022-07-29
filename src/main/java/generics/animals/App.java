package generics.animals;

import generics.humans.Square;

public class App {

    public static void main(String[] args) {

        AnimalBehaviors<Frog, Square> dogBehavios = new AnimalBehaviors<>(new Frog("Ruffle The Frog"), new Square("Trafalgar Square"));
        AnimalBehaviors<Cat, Square> catBehavios = new AnimalBehaviors<>(new Cat("Kitty The Cat"), new Square("Marco Zero Square"));

        dogBehavios.eat();
        dogBehavios.printName();
        dogBehavios.printType();
        dogBehavios.talk();

        System.out.println();

        catBehavios.eat();
        catBehavios.printName();
        catBehavios.printType();
        catBehavios.talk();

    }

}

