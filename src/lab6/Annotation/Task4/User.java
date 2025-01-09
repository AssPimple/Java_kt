package lab6.Annotation.Task4;

@Validate(value = {String.class, Integer.class}) // Применение аннотации к классу
public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
