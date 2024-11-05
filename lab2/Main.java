package lab2;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        System.out.println("1. Имена");
        System.out.println("2. Время");
        System.out.println("3. Сотрудники и отделы");
        System.out.println("4. Дополнение 3 задания вывод сотрудников отдела");
        System.out.println("5. Дополнение 2 задания");
        System.out.println("6. 2 Дополнение 2 задания");
        int x = scanner.nextInt();
        switch (x){
            case 1:
                // Создание экземпляров имен
                Name kleopatra = new Name("Клеопатра");
                Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
                Name mayakovsky = new Name("Маяковский", "Владимир", null); // Отчество не задано
                // Вывод имен на экран
                System.out.println(kleopatra);
                System.out.println(pushkin);
                System.out.println(mayakovsky);
                break;
            case 2:
                // Создание объектов времени с заданными значениями
                Time time1 = new Time(10);
                Time time2 = new Time(10000);
                Time time3 = new Time(100000);

                // Вывод времени на экран
                System.out.println("Время 1 (10 секунд): " + time1);
                System.out.println("Время 2 (10000 секунд): " + time2);
                System.out.println("Время 3 (100000 секунд): " + time3);
                break;
            case 3:
                Department itDepartment = new Department("IT", null);

                // Создаем сотрудников
                Employee petrov = new Employee("Петров", itDepartment);
                Employee kozlov = new Employee("Козлов", itDepartment);
                Employee sidorov = new Employee("Сидоров", itDepartment);

                // Назначаем Козлова начальником IT отдела
                itDepartment = new Department("IT", kozlov);

                // Переназначаем сотрудников на новый отдел с начальником
                petrov = new Employee("Петров", itDepartment);
                kozlov = new Employee("Козлов", itDepartment);
                sidorov = new Employee("Сидоров", itDepartment);

                // Выводим текстовое представление сотрудников
                System.out.println(petrov);
                System.out.println(kozlov);
                System.out.println(sidorov);
                break;
            case 4:
                // Создаем отдел IT
                Department itDepartment1 = new Department("IT", null);

                // Создаем сотрудников
                Employee petrov1 = new Employee("Петров", itDepartment1);
                Employee kozlov1 = new Employee("Козлов", itDepartment1);
                Employee sidorov1 = new Employee("Сидоров", itDepartment1);

                // Назначаем Козлова начальником IT отдела
                itDepartment1.setManager(kozlov1); // Устанавливаем менеджером Козлова

                // Выводим текстовое представление сотрудников
                System.out.println(petrov1);
                System.out.println(kozlov1);
                System.out.println(sidorov1);

                // Получаем список сотрудников отдела IT
                System.out.println("\nСписок сотрудников отдела " + itDepartment1.getName() + ":");
                List<Employee> employees = itDepartment1.getEmployees();
                for (Employee employee : employees) {
                    System.out.println(employee.getName());
                }
                break;
            case 5:
                // Создание объектов времени с заданными значениями
                Time time12 = new Time(10);
                Time time22 = new Time(10000);
                Time time32 = new Time(100000);
                Time time4 = new Time(2, 3, 5); // Время: 2 часа, 3 минуты, 5 секунд

                // Вывод времени на экран
                System.out.println("Время 1 (10 секунд): " + time12); // 00:00:10
                System.out.println("Время 2 (10000 секунд): " + time22); // 02:46:40
                System.out.println("Время 3 (100000 секунд): " + time32); // 01:46:40
                System.out.println("Время 4 (2 часа, 3 минуты, 5 секунд): " + time4); // 02:03:05
                break;
            case 6:
                // Создание объектов времени с заданными значениями
                Time time13 = new Time(34056); // 34056 секунд
                Time time23 = new Time(4532);   // 4532 секунды
                Time time33 = new Time(123);    // 123 секунды

                // Вывод информации о времени
                System.out.printf("Текущее время для 34056 секунд: %d часов\n", time13.getHours());
                System.out.printf("Сколько минут соответствуют времени 4532 секунд: %d минут\n", time23.getMinutes());
                System.out.printf("Сколько секунд соответствуют времени 123 секунд: %d секунд\n", time33.getSeconds());


        }
    }
}