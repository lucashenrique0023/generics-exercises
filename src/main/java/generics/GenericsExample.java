package generics;

import generics.with.Printer;
import generics.without.DoublePrinter;
import generics.without.IntegerPrinter;
import generics.without.StringPrinter;

public class GenericsExample {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(23);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(25.0);
        doublePrinter.print();

        StringPrinter stringPrinter = new StringPrinter("a");
        stringPrinter.print();

        Printer<Integer> printerInteger = new Printer<>(23);
        printerInteger.print();

        Printer<Double> printerDouble = new Printer<>(25.0);
        printerDouble.print();

        Printer<String> printerString = new Printer<>("a");
        printerString.print();
    }

}
