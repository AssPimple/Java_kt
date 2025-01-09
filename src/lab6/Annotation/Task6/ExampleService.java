package lab6.Annotation.Task6;

@Cache(value = {"userCache", "productCache"}) // Применение аннотации к классу с указанием значений
public class ExampleService {
    // Логика класса
    public void someMethod() {
        System.out.println("Метод someMethod выполнен.");
    }
}
