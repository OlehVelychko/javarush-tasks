package forTest.GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Animal animal2 = new Animal(2);

        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(animal);
        listAnimals.add(animal2);

//        test(listAnimals);

        Dog dog = new Dog();
        Dog dog1 = new Dog();

        List<Dog> listDogs = new ArrayList<>();
        listDogs.add(dog);
        listDogs.add(dog1);

        test(listDogs);

        testOneObject(animal);

    }

    /**
     * Wildcards is working
     *
     * @param animals
     */
    public static void test(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void testOneObject(Animal animal) {
        System.out.println(animal);
    }
}
