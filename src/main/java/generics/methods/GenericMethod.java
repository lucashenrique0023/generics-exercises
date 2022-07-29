package generics.methods;

import generics.animals.Cat;
import generics.animals.Frog;

public class GenericMethod {

    public static void main(String[] args) {
        shout("SHOUT", 25);
        shout(57, "SHOUT");
        shout(new Cat("Kitty"), new Frog("Ruffle"));
    }

    // When is needed to recieve a generic parameter, we must
    // declare Generic before return declaration and of course, on parameter.
    // Multiple parameters, just use comma
    private static <T, V> T shout (T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
        System.out.println();

        return thingToShout;
    }
}
