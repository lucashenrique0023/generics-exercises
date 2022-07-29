package generics.animals;

public class App {

    public static void main(String[] args) {

        AnimalBehaviors<Frog> dogBehavios = new AnimalBehaviors<>(new Frog("Ruffle The Frog"));
        AnimalBehaviors<Cat> catBehavios = new AnimalBehaviors<>(new Cat("Kitty The Cat"));

        dogBehavios.eat();
        dogBehavios.printName();
        dogBehavios.printType();

        System.out.println();

        catBehavios.eat();
        catBehavios.printName();
        catBehavios.printType();

    }

}

