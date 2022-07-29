package generics.with;

/*
 Type Parameter <T> Means when this class is instantiated a Type
 must be passed through brackets like:
 Printer<String> printer = new Printer<>();
*/
public class Printer <T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
