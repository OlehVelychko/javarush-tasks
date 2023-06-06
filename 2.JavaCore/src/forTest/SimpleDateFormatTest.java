package forTest;

import com.javarush.task.task17.task1710.Sex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest {
    public static class Person {
        private String name;
        private Sex sex;
        private Date birthDate;

        private Person(String name, Sex sex, Date birthDate) {
            this.name = name;
            this.sex = sex;
            this.birthDate = birthDate;
        }

        public static Person createMale(String name, Date birthDate) {
            return new Person(name, Sex.MALE, birthDate);
        }

        public static Person createFemale(String name, Date birthDate) {
            return new Person(name, Sex.FEMALE, birthDate);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public static void main(String[] args) {
            // Создаем новый экземпляр Person
            Person person = new Person("Миронов", Sex.MALE, new Date(90, 3, 15));

            // Создаем форматтер даты с указанным форматом и локалью
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            // Выводим дату экземпляра Person в указанном формате
            String formattedDate = dateFormat.format(person.getBirthDate());
            System.out.println(formattedDate);
        }
    }



}
