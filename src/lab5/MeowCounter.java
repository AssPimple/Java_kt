package lab5;

public class MeowCounter {
    private Cat cat; // Ссылка на объект Cat
    private int meowCount; // Счетчик мяуканий

    // Конструктор, принимающий объект Cat
    public MeowCounter(Cat cat) {
        this.cat = cat;
        this.meowCount = 0; // Изначально счетчик мяуканий равен 0
    }

    // Метод для "мяуканья", увеличивающий счетчик
    public void meow() {
        meowCount++;
        cat.meow(); // Вызываем метод мяуканья у кота
    }

    // Метод для получения количества мяуканий
    public int getMeowCount() {
        return meowCount;
    }

    // Переопределение метода toString для текстового представления счетчика
    @Override
    public String toString() {
        return "Счетчик мяуканий для " + cat.toString() + ": " + meowCount;
    }
}