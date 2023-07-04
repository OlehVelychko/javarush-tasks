package forTest.LearnJava;

public class CatTestDrive {
    public static void main(String[] args) {
        Cat my = new Cat("Eiilin");
        System.out.println(my.getClass().getSimpleName());
        System.out.println(my.hashCode());
        System.out.println(my.toString());
    }

}
