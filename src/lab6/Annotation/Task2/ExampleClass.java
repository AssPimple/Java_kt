package lab6.Annotation.Task2;

@Default(value = String.class) // Применение аннотации к классу
public class ExampleClass {
    @Default(value = Integer.class) // Применение аннотации к полю
    private int number;

    // Конструктор
    public ExampleClass(int number) {
        this.number = number;
    }

    // Метод для получения значения поля
    public int getNumber() {
        return number;
    }
}