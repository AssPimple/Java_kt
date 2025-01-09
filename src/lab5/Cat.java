package lab5;

public class Cat implements Meowable {
    private String name; // Имя кота

    // Конструктор, принимающий имя кота
    public Cat(String name) {
        this.name = name;
    }

    // Метод для вывода мяуканья
    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }

    // Переопределение метода toString для текстового представления кота
    @Override
    public String toString() {
        return "Котa " + name;
    }
}
