package lab4;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<Integer> box = new Box<>(); // Создаем коробку для целочисленных значении
        int choice;
        System.out.println("\nВыберите задание:");
        System.out.println("1. Коробка");
        System.out.println("2. Хранилище");
        System.out.println("3. Точка в коробке");
        System.out.println("4. Функция");
        System.out.println("5. Фильтрация");
        System.out.println("6. Сокращение");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int choice1;
                while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Положить объект в коробку");
                System.out.println("2. Извлечь объект из коробки");
                System.out.println("3. Проверить, пуста ли коробка");
                System.out.println("4. Вывести содержимое коробки");
                System.out.println("5. Выйти");
                System.out.print("Введите номер действия: ");

                try {
                    choice1 = scanner.nextInt();

                    switch (choice1) {
                        case 1:
                            System.out.print("Введите целочисленное значение для хранения в коробке: ");
                            try {
                                int value = scanner.nextInt();
                                box.putItem(value);
                                System.out.println("Число " + value + " успешно помещено в коробку.");
                            } catch (InputMismatchException e) {
                                System.out.println("Ошибка: Пожалуйста, введите целое число.");
                                scanner.next(); // очищаем неверный ввод
                            } catch (Exception e) {
                                System.out.println("Ошибка: " + e.getMessage());
                            }
                            break;

                        case 2:
                            try {
                                int value = box.getItem();
                                System.out.println("Из коробки извлечено значение: " + value);
                            } catch (Exception e) {
                                System.out.println("Ошибка: " + e.getMessage());
                            }
                            break;

                        case 3:
                            if (box.isEmpty()) {
                                System.out.println("Коробка пуста.");
                            } else {
                                System.out.println("Коробка не пуста.");
                            }
                            break;

                        case 4:
                            System.out.println(box);
                            break;

                        case 5:
                            System.out.println("Выход из программы.");
                            return; // Выход из программы

                        default:
                            System.out.println("Ошибка: Пожалуйста, выберите корректное действие.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Пожалуйста, введите корректный номер действия.");
                    scanner.next(); // очищаем неверный ввод
                }

            }
            case 2:
                // Задание 1: Хранилище чисел с null значением
                Storage<Integer> intStorageWithNull = new Storage<>(null);
                int alternativeForNull = 0; // Альтернативное значение
                System.out.println("Значение: " + intStorageWithNull.getItem(alternativeForNull));

                // Задание 2: Хранилище чисел с 99
                Storage<Integer> intStorageWith99 = new Storage<>(99);
                int alternativeFor99 = -1; // Альтернативное значение
                System.out.println("Значение: " + intStorageWith99.getItem(alternativeFor99));

                // Задание 3: Хранилище строк с null значением
                Storage<String> stringStorageWithNull = new Storage<>(null);
                String alternativeForStringNull = "default"; // Альтернативное значение
                System.out.println("Значение: " + stringStorageWithNull.getItem(alternativeForStringNull));

                // Задание 4: Хранилище строк с "hello"
                Storage<String> stringStorageWithHello = new Storage<>("hello");
                String alternativeForHello = "hello world"; // Альтернативное значение
                System.out.println("Значение: " + stringStorageWithHello.getItem(alternativeForHello));
                break;
            case 3:
                try {
                    // Создаем Коробку для хранения трехмерной точки
                    Box<Point3D> box1 = new Box<>(); // Изначально коробка пуста

                    // Добавляем трехмерную точку (2.1, 5.0, 7.3) в коробку
                    addPoint3DToBox(box1, 2.1, 5.0, 7.3);

                    // Выводим хранимую точку
                    Point3D point = box1.getItem();
                    System.out.println("Сохраненная трехмерная точка: " + point);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;
            case 4:
                // Пример 1: строки в длины
                List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
                List<Integer> lengths = transform(strings, String::length);
                System.out.println(lengths); // [6, 5, 2]

                // Пример 2: превращение отрицательных чисел в положительные
                List<Integer> numbers = Arrays.asList(1, -3, 7);
                List<Integer> absoluteValues = transform(numbers, Math::abs);
                System.out.println(absoluteValues); // [1, 3, 7]

                // Пример 3: получение максимальных значений из массивов
                List<int[]> arrays = Arrays.asList(new int[]{1, 2, 3}, new int[]{-1, -2, -3}, new int[]{5, 4, 6});
                List<Integer> maxValues = transform(arrays, array -> Arrays.stream(array).max().orElse(Integer.MIN_VALUE));
                System.out.println(maxValues); // [3, -1, 6]
                break;
            case 5:
                // Пример 1: фильтрация строк с длиной менее 3 символов
                List<String> strings1 = Arrays.asList("qwerty", "asdfg", "zx");
                List<String> filteredStrings = filter(strings1, s -> s.length() >= 3);
                System.out.println(filteredStrings); // [qwerty, asdfg]

                // Пример 2: фильтрация положительных чисел
                List<Integer> numbers1 = Arrays.asList(1, -3, 7);
                List<Integer> filteredNumbers = filter(numbers1, n -> n < 0);
                System.out.println(filteredNumbers); // [-3]

                // Пример 3: фильтрация списков целых чисел
                // В этом случае мы передадим список списков
                List<List<Integer>> arrayLists = Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(-1, -2, -3),
                        Arrays.asList(5, 4, 6),
                        Arrays.asList(-1, -2)
                );

                // Фильтруем списки, оставляя только те, у которых нет положительных элементов
                List<List<Integer>> filteredArrayLists = filter(arrayLists, array -> array.stream().noneMatch(n -> n > 0));
                System.out.println(filteredArrayLists); // [[-1, -2, -3], [-1, -2]]
                break;
            case 6:
                // Пример 1: разбиваем на положительные и отрицательные числа
                List<Integer> numbers2 = Arrays.asList(1, -3, 7);

                Collection<List<Integer>> positiveNegativeNumbers = collect(numbers2,
                        ArrayList::new,    // Фабрика коллекции
                        n -> n > 0);       // Условие фильтрации: только положительные числа

                Collection<List<Integer>> negativeNumbers = collect(numbers2,
                        ArrayList::new,    // Фабрика коллекции
                        n -> n < 0);       // Условие фильтрации: только отрицательные числа

                System.out.println("Положительные числа: " + positiveNegativeNumbers);
                System.out.println("Отрицательные числа: " + negativeNumbers);

                // Пример 2: разбиваем строки по длине
                List<String> strings2 = Arrays.asList("qwerty", "asdfg", "zx", "qw");

                // Создаем коллекцию строк одинаковой длины
                List<List<String>> groupedByLength = new ArrayList<>();
                strings2.stream()
                        .collect(Collectors.groupingBy(String::length))
                        .forEach((length, list) -> groupedByLength.add(new ArrayList<>(list)));

                System.out.println("Строки группированные по длине: " + groupedByLength);

                // Пример 3: создаем набор уникальных строк
                List<String> uniqueStrings = Arrays.asList("qwerty", "asdfg", "qwerty", "qw");

                Collection<String> uniqueCollection = new java.util.HashSet<>(uniqueStrings);

                System.out.println("Уникальные строки: " + uniqueCollection);
        }
    }
    // Метод для добавления трехмерной точки в коробку
    public static <T> void addPoint3DToBox(Box<T> box, double x, double y, double z) throws Exception {
        Point3D point = new Point3D(x, y, z);
        box.putItem((T) point); // Приведение типа к T
    }
    // Метод, применяющий функцию к каждому элементу списка
    public static <T, P> List<P> transform(List<T> items, Function<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T item : items) {
            result.add(function.apply(item));
        }
        return result;
    }
    public static <T> List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
    // Метод для создания коллекции P из списка значений T
    public static <T, P extends Collection<T>> List<P> collect(List<T> items,
                                                               Function<List<T>, P> collectionFactory,
                                                               Predicate<T> filter) {
        List<T> filteredItems = items.stream()
                .filter(filter)
                .collect(Collectors.toList());
        List<P> result = new ArrayList<>();
        result.add(collectionFactory.apply(filteredItems));
        return result;
    }

}
