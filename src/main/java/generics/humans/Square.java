package generics.humans;

public class Square implements Place {

    String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
