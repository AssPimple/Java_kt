package lab5;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\nВыберите задание:");
        System.out.println("1. Шаблоны");
        System.out.println("2. Структурные шаблоны");
        System.out.println("3. Список");
        System.out.println("4. Сет");
        System.out.println("5. Очередь");
        System.out.println("6. Стрим 2");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Создаем дроби
                Fraction fraction1 = new Fraction(1, 2); // дробь 1/2
                Fraction fraction2 = new Fraction(2, 4); // дробь 2/4

                // Выводим дроби
                System.out.println("Дробь 1: " + fraction1); // Вывод: Дробь 1: 1/2
                System.out.println("Дробь 2: " + fraction2); // Вывод: Дробь 2: 2/4

                // Выводим вещественные значения дробей
                System.out.println("Значение дроби 1: " + fraction1.getValue()); // Вывод: 0.5
                System.out.println("Значение дроби 2: " + fraction2.getValue()); // Вывод: 0.5

                // Сравниваем дроби
                System.out.println("Являются ли дроби равными? " + fraction1.equals(fraction2)); // Вывод: true

                // Устанавливаем новый числитель для дроби 2
                fraction2.setNumerator(3);
                System.out.println("Новое значение дроби 2: " + fraction2); // Вывод: 3/4
                System.out.println("Значение дроби 2: " + fraction2.getValue()); // Вывод: 0.75
                break;
            case 2:
                Cat kitty = new Cat("Мурзик"); // Создаем кота с именем "Мурзик"

                Funs.meowsCare(kitty); // Передаем кота в метод

                // Получаем и выводим количество мяуканий
                // Приводим к типу Cat
                System.out.println(kitty + " мяукал " + kitty.getMeowCount() + " раз(а)"); // Выводим результат
                break;
            case 3:
                // Исходные списки
                List<Integer> L1 = new ArrayList<>();
                List<Integer> L2 = new ArrayList<>();

                // Заполнение списков для примера
                L1.add(1);
                L1.add(2);
                L1.add(3);
                L1.add(4);
                L1.add(5);

                L2.add(4);
                L2.add(5);
                L2.add(6);
                L2.add(7);
                L2.add(8);

                // Вызываем метод для нахождения пересечения
                List<Integer> L = findCommonElements(L1, L2);

                // Выводим результат
                System.out.println("Список L, содержащий элементы, которые входят одновременно в оба списка L1 и L2: " + L);
            case 4:
                String filePath = "C:\\Users\\Pimple\\IdeaProjects\\untitled\\lab5\\src\\text.txt";  // Замените на путь к вашему файлу

                // Используем HashSet для хранения уникальных букв
                Set<Character> uniqueLetters = new HashSet<>();

                try {
                    // Чтение файла построчно
                    List<String> lines = Files.readAllLines(Paths.get(filePath));
                    for (String line : lines) {
                        // Преобразуем строку в массив символов
                        for (char ch : line.toCharArray()) {
                            // Проверяем, является ли символ буквой и добавляем в Set
                            if (isRussianLetter(ch)) {
                                uniqueLetters.add(Character.toLowerCase(ch)); // Добавляем в нижнем регистре
                            }
                        }
                    }

                    // Выводим количество уникальных букв
                    System.out.println("Количество уникальных букв: " + uniqueLetters.size());
                } catch (IOException e) {
                    System.out.println("Ошибка при чтении файла: " + e.getMessage());
                }
            case 5:
                // Исходный список
                List<Integer> L12 = List.of(1, 2, 3, 4); // Пример списка, замените на ваши данные

                // Построение очереди
                List<Integer> queue = buildQueue(L12);

                // Вывод результата
                System.out.println(queue);
            case 6:
                String filePath1 = "C:\\Users\\Pimple\\IdeaProjects\\untitled\\lab5\\src\\text1.txt"; // Укажите путь к вашему файлу

                try {
                    // Чтение данных из файла и обработка
                    Map<Integer, List<String>> groupedNames = Files.lines(Paths.get(filePath1))
                            .map(line -> line.split(":")) // Разделяем строку по символу ':'
                            .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty()) // Убираем строки без номера
                            .map(parts -> new Person(parts[0].trim(), Integer.parseInt(parts[1].trim()))) // Создаем объект Person
                            .collect(Collectors.groupingBy(
                                    Person::getNumber, // Группируем по номеру
                                    Collectors.mapping(
                                            person -> capitalize(person.getName()), // Приводим имя к нужному регистру
                                            Collectors.toList()
                                    )
                            ));

                    // Вывод результата
                    System.out.println(groupedNames);
                } catch (IOException e) {
                    System.out.println("Ошибка при чтении файла: " + e.getMessage());
                }
        }

    }
    // Метод для нахождения общих элементов в двух списках
    public static List<Integer> findCommonElements(List<Integer> L1, List<Integer> L2) {
        Set<Integer> set1 = new HashSet<>(L1); // Преобразуем первый список в множество
        Set<Integer> set2 = new HashSet<>(L2); // Преобразуем второй список в множество
        set1.retainAll(set2); // Оставляем в первом множестве только те элементы, которые есть во втором

        return new ArrayList<>(set1); // Возвращаем результат в виде списка
    }
    // Метод для проверки, является ли символ буквой русского алфавита
    private static boolean isRussianLetter(char ch) {
        return (ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я');
    }
    public static List<Integer> buildQueue(List<Integer> L) {
        List<Integer> queue = new ArrayList<>();

        // Добавляем элементы из списка L
        queue.addAll(L);

        // Добавляем элементы в обратном порядке
        for (int i = L.size() - 1; i >= 0; i--) {
            queue.add(L.get(i));
        }

        return queue;
    }
    // Метод для капитализации строки
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}

