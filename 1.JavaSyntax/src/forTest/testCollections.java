package forTest;

import java.util.*;

public class testCollections {
    public static void main(java.lang.String[] args) {

        /*String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));

        Collections.sort(solarSystem);
        System.out.println(solarSystem);

        Collections.reverse(solarSystem);
        System.out.println(solarSystem);*/


        /*List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        numbers.forEach(number -> System.out.println(number));*/

        /*List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        numbers.removeIf(n -> n > 5);
        numbers.forEach(number -> System.out.println(number));*/

        Map<String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a, b) -> System.out.println("Название книги: " + a + ". Автор: " + b));



    }
}
