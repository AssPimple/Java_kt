package lab5;

// Класс для хранения имени и номера
public class Person {
    private final String name;
    private final int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}