package lab4;

public class Storage<T> {
    private final T item; // хранит объект

    // Конструктор принимает объект, который будет храниться в хранилище
    public Storage(T item) {
        this.item = item;
    }

    // Метод получения объекта с альтернативным значением
    public T getItem(T alternative) {
        return item != null ? item : alternative;
    }
}