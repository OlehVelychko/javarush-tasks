package forTest;

public class UnicodeCharA {
    public static void main(String[] args) {
        char ch = 'a'; // символ 'a' заданный в коде
        int intVal = ch; // приведение символа к целому числу
        int unicodeVal = Character.getNumericValue(ch); // получение Unicode-значения символа

        System.out.println("Значение в int: " + intVal); // вывод значения в int
        System.out.println("Значение в Unicode: " + Integer.toHexString(unicodeVal)); // вывод значения в Unicode
    }

}
