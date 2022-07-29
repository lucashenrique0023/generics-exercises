package generics.methods;

import generics.animals.Cat;

public class GenericMethod {

    public static void main(String[] args) {
        shout("SHOUT");
        shout(57);
        shout(new Cat("Kitty"));
    }

    // When is needed to recieve a generic parameter, we must
    // declare Generic before return declaration and of course, on parameter.
    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }
}
