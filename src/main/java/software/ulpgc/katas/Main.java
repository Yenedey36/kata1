package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lourdes", LocalDate.of(2005, 2, 15));
        System.out.println(person);
        System.out.println(person.age());
    }
}
