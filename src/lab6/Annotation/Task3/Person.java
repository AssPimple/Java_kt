package lab6.Annotation.Task3;

@ToString // Применение аннотации к классу
public class Person {

    @ToString(value = "NO") // Применение аннотации к полю
    private String password;

    private String name;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}