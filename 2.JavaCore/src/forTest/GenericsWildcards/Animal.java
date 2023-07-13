package forTest.GenericsWildcards;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
