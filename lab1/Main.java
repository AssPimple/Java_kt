// импорт библиотеки для ввода данных
import java.util.Scanner;
// основной класс
public class Main {
    private Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    // выбор задания
    private void run() {
        while (true) {
            System.out.println("Выберите задание (1-20) или 0 для выхода:");
            System.out.println("1: Получить дробную часть числа");
            System.out.println("2: Преобразовать символ в число");
            System.out.println("3: Проверить двузначность числа");
            System.out.println("4: Проверить, входит ли число в диапазон");
            System.out.println("5: Проверить равенство трех чисел");
            System.out.println("6: Получить модуль числа");
            System.out.println("7: Проверить делимость числа на 3 или 5");
            System.out.println("8: Найти максимум из трех чисел");
            System.out.println("9: Двойная сумма двух чисел");
            System.out.println("10: Определить день недели");
            System.out.println("11: Вывести числа от 0 до N");
            System.out.println("12: Вывести четные числа от 0 до N");
            System.out.println("13: Определить длину числа");
            System.out.println("14: Вывести квадрат");
            System.out.println("15: Вывести правый треугольник");
            System.out.println("16: Найти индекс первого вхождения числа в массив");
            System.out.println("17: Найти максимальное по модулю значение в массиве");
            System.out.println("18: Вставить массив в другой массив");
            System.out.println("19: Реверсировать массив");
            System.out.println("20: Найти все вхождения числа в массиве");
            System.out.println("0: Выход из программы");
            int task = scanner.nextInt();

            if (task == 0) {
                break;
            }
            // перенаправление после выбора для исполнения команд
            switch (task) {
                case 1:
                    System.out.println("Введите число для дробной части:");
                    double x = getDoubleInput();
                    System.out.println("Дробная часть: " + fraction(x));
                    break;
                case 2:
                    System.out.println("Введите символ:");
                    char c = getCharInput();
                    System.out.println("Буква в число: " + charToNum(c));
                    break;
                case 3:
                    System.out.println("Введите число:");
                    int num = getIntInput();
                    System.out.println("Двузначное: " + is2Digits(num));
                    break;
                case 4:
                    System.out.println("Введите границы диапазона (a и b):");
                    int a = getIntInput();
                    int b = getIntInput();
                    System.out.println("Введите число для проверки:");
                    int checkNum = getIntInput();
                    System.out.println("Число " + checkNum + " входит в диапазон: " + isInRange(a, b, checkNum));
                    break;
                case 5:
                    System.out.println("Введите три числа для проверки на равенство:");
                    int a1 = getIntInput();
                    int b1 = getIntInput();
                    int c1 = getIntInput();
                    System.out.println("Все числа равны: " + isEqual(a1, b1, c1));
                    break;
                case 6:
                    System.out.println("Введите число для получения его модуля:");
                    int absNum = getIntInput();
                    System.out.println("Модуль числа: " + abs(absNum));
                    break;
                case 7:
                    System.out.println("Введите число для проверки на делимость на 3 или 5:");
                    int divNum = getIntInput();
                    System.out.println("Число " + divNum + " делится на 3 или 5: " + is35(divNum));
                    break;
                case 8:
                    System.out.println("Введите три числа для нахождения максимума:");
                    int x1 = getIntInput();
                    int y1 = getIntInput();
                    int z1 = getIntInput();
                    System.out.println("Максимальное число: " + max3(x1, y1, z1));
                    break;
                case 9:
                    System.out.println("Введите два числа для двойной суммы:");
                    int x2 = getIntInput();
                    int y2 = getIntInput();
                    System.out.println("Результат двойной суммы: " + sum2(x2, y2));
                    break;
                case 10:
                    System.out.println("Введите номер дня недели (1-7):");
                    int dayNum = getIntInput();
                    System.out.println("День недели: " + day(dayNum));
                    break;
                case 11:
                    System.out.println("Введите число для вывода последовательности:");
                    int listNum = getIntInput();
                    System.out.println("Числа от 0 до " + listNum + ": " + listNums(listNum));
                    break;
                case 12:
                    System.out.println("Введите число для вывода четных чисел:");
                    int chetNum = getIntInput();
                    System.out.println("Четные числа от 0 до " + chetNum + ": " + chet(chetNum));
                    break;
                case 13:
                    System.out.println("Введите число для определения длины:");
                    long longNum = getLongInput();
                    System.out.println("Длина числа: " + numLen(longNum));
                    break;
                case 14:
                    System.out.println("Введите размер квадрата:");
                    int squareSize = getIntInput();
                    square(squareSize);
                    break;
                case 15:
                    System.out.println("Введите размер правого треугольника:");
                    int triangleSize = getIntInput();
                    rightTriangle(triangleSize);
                    break;
                case 16:
                    System.out.println("Введите размер массива:");
                    int arrSize = getIntInput();
                    int[] arr = new int[arrSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrSize; i++) {
                        arr[i] = getIntInput();
                    }
                    System.out.println("Введите число для поиска:");
                    int findNum = getIntInput();
                    System.out.println("Индекс первого вхождения: " + findFirst(arr, findNum));
                    break;
                case 17:
                    System.out.println("Введите размер массива:");
                    int maxSize = getIntInput();
                    int[] maxArr = new int[maxSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < maxSize; i++) {
                        maxArr[i] = getIntInput();
                    }
                    System.out.println("Максимальное по модулю значение: " + maxAbs(maxArr));
                    break;
                case 18:
                    System.out.println("Введите размер основного массива:");
                    int mainArrSize = getIntInput();
                    int[] mainArr = new int[mainArrSize];
                    System.out.println("Введите элементы основного массива:");
                    for (int i = 0; i < mainArrSize; i++) {
                        mainArr[i] = getIntInput();
                    }
                    System.out.println("Введите размер вставляемого массива:");
                    int insSize = getIntInput();
                    int[] insArr = new int[insSize];
                    System.out.println("Введите элементы вставляемого массива:");
                    for (int i = 0; i < insSize; i++) {
                        insArr[i] = getIntInput();
                    }
                    System.out.println("Введите позицию вставки:");
                    int pos = getIntInput();
                    int[] resultArr = add(mainArr, insArr, pos);
                    System.out.print("Результирующий массив: ");
                    for (int numRes : resultArr) {
                        System.out.print(numRes + " ");
                    }
                    System.out.println();
                    break;
                case 19:
                    System.out.println("Введите размер массива для реверса:");
                    int revSize = getIntInput();
                    int[] revArr = new int[revSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < revSize; i++) {
                        revArr[i] = getIntInput();
                    }
                    int[] reversedArr = reverseBack(revArr);
                    System.out.print("Реверсированный массив: ");
                    for (int numRev : reversedArr) {
                        System.out.print(numRev + " ");
                    }
                    System.out.println();
                    break;
                case 20:
                    System.out.println("Введите размер массива для поиска всех вхождений:");
                    int findAllSize = getIntInput();
                    int[] findAllArr = new int[findAllSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < findAllSize; i++) {
                        findAllArr[i] = getIntInput();
                    }
                    System.out.println("Введите число для поиска всех вхождений:");
                    int findAllNum = getIntInput();
                    int[] indices = findAll(findAllArr, findAllNum);
                    System.out.print("Индексы всех вхождений: ");
                    for (int index : indices) {
                        System.out.print(index + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    // Методы для выполнения заданий

    public double fraction(double x) {
        return x - Math.floor(x);
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        return x >= 10 && x < 100;
    }

    public boolean isInRange(int a, int b, int num) {
        return num >= Math.min(a, b) && num <= Math.max(a, b);
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    public int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public int numLen(long x) {
        return String.valueOf(x).length();
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.printf("%" + x + "s%n", "*".repeat(i));
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = Math.abs(arr[0]);
        for (int num : arr) {
            if (Math.abs(num) > max) {
                max = Math.abs(num);
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    // Вспомогательные методы для ввода данных

    private int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз:");
            }
        }
    }

    private double getDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз:");
            }
        }
    }

    private long getLongInput() {
        while (true) {
            try {
                return Long.parseLong(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз:");
            }
        }
    }

    private char getCharInput() {
        while (true) {
            String input = scanner.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("Некорректный ввод. Введите один символ:");
            }
        }
    }
}
