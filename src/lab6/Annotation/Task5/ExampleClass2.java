package lab6.Annotation.Task5;

@Two(first = "Example", second = 42) // Применение аннотации к классу
public class ExampleClass2 {
    private String name;
    private int value;

    public ExampleClass2(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}