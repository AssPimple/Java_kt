package lab5;

public class Cat implements Meowable {
    private String name;           // Имя кота
    private int meowCount;        // Счетчик мяуканий

    // Конструктор, принимающий имя кота
    public Cat(String name) {
        this.name = name;
        this.meowCount = 0; // Изначально кот не мяукает
    }

    // Метод для вывода мяуканья
    @Override
    public void meow() {
        this.meowCount++;
        System.out.println(name + ": мяу!");
    }

    // Метод для получения количества мяуканий
    public int getMeowCount() {
        return meowCount;
    }

    // Переопределение метода toString для текстового представления кота
    @Override
    public String toString() {
        return "Kот " + name;
    }
}