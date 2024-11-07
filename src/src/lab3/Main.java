package lab3;


import java.util.Scanner;
import java.util.ArrayList; // Импортируем необходимые классы для работы с коллекциями
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания");
        System.out.println("1. Сотрудники");
        System.out.println("2. Трехмерные точки ");
        System.out.println("3. Птички");
        System.out.println("6. Пение птичек");
        System.out.println("7. Сравнение точек");
        int x = scanner.nextInt();
        switch (x){
            case 1:
                Department itDepartment = new Department("IT", null);
                Department itDepartment1 = new Department("IT1", null);// Создание отдела без начальника
                Employee petrov = new Employee("Петров", itDepartment);
                Employee kozlov = new Employee("Козлов", itDepartment1);
                Employee sidorov = new Employee("Сидоров", itDepartment);

                itDepartment.setManager(kozlov); // Установка Козлова начальником отдела
                System.out.println(petrov);
                System.out.println(kozlov);
                System.out.println(sidorov);
                break;
            case 2:
                // Создание трехмерной точки
                Point3D point3D1 = new Point3D(1.0, 2.0, 3.0);
                Point3D point3D2 = new Point3D(4.0, 5.0, 6.0);
                Point3D point3D3 = new Point3D(7.0, 8.0, 9.0);

                // Вывод текстового представления трехмерных точек
                System.out.println("\nТрехмерные точки:");
                System.out.println("Point 3D 1: " + point3D1);
                System.out.println("Point 3D 2: " + point3D2);
                System.out.println("Point 3D 3: " + point3D3);
                break;
            case 3:
                Bird sparrow = new Sparrow();
                Bird cuckoo = new Cuckoo();
                Bird parrot = new Parrot("Привет как дела? Как настроение?");

                // Птицы поют
                sparrow.sing();
                cuckoo.sing();
                parrot.sing();
                break;
            case 4:
                List<Bird> birds = new ArrayList<>(); // Создаем список для птиц
                birds.add(new Cuckoo());
                birds.add(new Sparrow()); // Добавляем воробьев
                birds.add(new Sparrow());

                birds.add(new Parrot("Привет, как дела?"));
                birds.add(new Cuckoo()); // Добавляем кукушек

                birds.add(new Sparrow());

                birds.add(new Parrot("Я прекрасно!"));

                singAllBirds(birds); // Вызываем метод пения для всех птиц
                break;
            case 5:
                Point p1 = new Point(-1.0, 2.0);
                Point p2 = new Point(-1.0, 2.0);
                Point p3 = new Point(2.0, 3.0);
                System.out.println("Точки:");
                System.out.println("1 Точка:\n x: " + p1.getX() + "|y: " + p1.getY());
                System.out.println("1 Точка:\n x: " + p2.getX() + "|y: " + p2.getY());
                System.out.println("1 Точка:\n x: " + p3.getX() + "|y: " + p3.getY());
                System.out.println("Сравнение 1 и 2 точки: " + p1.equals(p2)); // true
                System.out.println("Сравнение 1 и 3 точки: " + p1.equals(p3)); // false
                break;
        }
    }
    public static void singAllBirds(List<Bird> birds) {
        for (Bird bird : birds) {
            bird.sing(); // Вызов метода пения для каждой птицы
        }
    }
}
