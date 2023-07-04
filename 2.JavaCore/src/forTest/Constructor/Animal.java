package forTest.Constructor;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }
    public Animal(String theName) {
        name = theName;
        System.out.println("создание Animal");
    }
}