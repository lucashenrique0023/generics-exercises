package generics.methods;

import generics.animals.Animal;
import generics.animals.Cat;
import generics.animals.Frog;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodList {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Kitty!"));
        printList(catList);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Linda"));
        animals.add(new Frog("Ruffle"));
        printListAnimals(animals);
    }

    // Take a list that hold any type of object and print out the list
    // If we try to create a method that receive List<Object> and try to pass
    // a List<Integer>, we get an error, because a List of Integer is not a List of Object,
    // A list of Integer is a Object!
    // Thats why we need to use Wildcards
    //public static void printList(List<Object> myList) {
    public static void printList(List<?> myList) {
        System.out.println();
        myList.forEach(v -> System.out.println(v));
    }


    public static void printListAnimals(List<? extends Animal> animalList) {
        System.out.println();
        animalList.forEach(animal -> System.out.println(animal));
    }
}
