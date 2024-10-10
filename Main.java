// Импорт для исключения и ввода с клавиатуры
import java.util.InputMismatchException;
import java.util.Scanner;
// основной класс
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // основной цикл приложения
        while(true){
            System.out.println("Выберите задание для проверки:");
            System.out.println("1. Дробная часть");
            System.out.println("2. Сложение 2 последних чисел");
            System.out.println("3. Букву в число");
            System.out.println("4. Проверка на положительное число");
            System.out.println("5. Проверка на двузначное число");
            System.out.println("6. Найти модуль числа");
            System.out.println("7. Безопасное деление");
            System.out.println("8. Проверка деления на 3 или 5 но не на оба сразу");
            System.out.println("9. Сравнение двух чисел");
            System.out.println("10. Максимум из 3 чисел");
            System.out.println("11. Вывод числа от 0 до выбранного");
            System.out.println("12. Вывод числа от выбранного до 0");
            System.out.println("13. Вывести только четные");
            System.out.println("14. Степень числа");
            System.out.println("15. Длина числа");
            System.out.println("16. Поиск первого значения");
            System.out.println("17. Поиск последнего значения");
            System.out.println("18. Поиск максимального по модулю");
            System.out.println("19. Добавление в массив");
            System.out.println("20. Добавление массива в массив");

            try {
            int choice = scanner.nextInt();
            // исполнение заданий в зависимости от выбора ползователя
            switch (choice) {
                case 1:
                    System.out.println("Введите число:");
                    double x = scanner.nextDouble();
                    System.out.println("Дробная часть: " + fraction(x));
                    break;
                case 2:
                    System.out.println("Введите число:");
                    int x2 = scanner.nextInt();
                    System.out.println("Сумма знаков: " + sumLastNums(x2));
                    break;
                case 3:
                    System.out.println("Введите символ:");
                    char x3 = scanner.next().charAt(0);
                    System.out.println("Букву в число: " + charToNum(x3));
                    break;
                case 4:
                    System.out.println("Введите число:");
                    int x4 = scanner.nextInt();
                    System.out.println("Есть ли позитив: " + isPositive(x4));
                    break;
                case 5:
                    System.out.println("Введите число:");
                    int x5 = scanner.nextInt();
                    System.out.println("Двузначное: " + is2Digits(x5));
                    break;
                case 6:
                    System.out.println("Введите число:");
                    int x6 = scanner.nextInt();
                    System.out.println("Модуль числа: " + abs(x6));
                    break;
                case 7:
                    System.out.println("Введите 2 числа:");
                    int x7 = scanner.nextInt();
                    int y7 = scanner.nextInt();
                    System.out.println("Безопасное деление: " + safeDiv(x7, y7));
                    break;
                case 8:
                    System.out.println("Введите число:");
                    int x8 = scanner.nextInt();
                    System.out.println("Тридцать пять: " + is35(x8));
                    break;
                case 9:
                    System.out.println("Введите 2 числа:");
                    int x9 = scanner.nextInt();
                    int y9 = scanner.nextInt();
                    System.out.println("Строка сравнения: " + makeDecision(x9, y9));
                    break;
                case 10:
                    System.out.println("Введите 3 числа:");
                    int x10 = scanner.nextInt();
                    int y10 = scanner.nextInt();
                    int z10 = scanner.nextInt();
                    System.out.println("Тройной максимум: " + max3(x10, y10, z10));
                    break;
                case 11:
                    System.out.println("Введите число:");
                    int x11 = scanner.nextInt();
                    System.out.println("Числа подряд: " + listNums(x11));
                    break;
                case 12:
                    System.out.println("Введите число:");
                    int x12 = scanner.nextInt();
                    System.out.println("Числа наоборот: " + reverseListNums(x12));
                    break;
                case 13:
                    System.out.println("Введите число:");
                    int x13 = scanner.nextInt();
                    System.out.println("Четные числа: " + chet(x13));
                    break;
                case 14:
                    System.out.println("Введите 2 числа(сначала число потом степень):");
                    int x14 = scanner.nextInt();
                    int y14 = scanner.nextInt();
                    System.out.println("Степень числа: " + pow(x14, y14));
                    break;
                case 15:
                    System.out.println("Введите число:");
                    long x15 = scanner.nextLong();
                    System.out.println("Длина числа: " + numLen(x15));
                    break;
               
                case 16:
                    System.out.println("Введите массив и число:");
                    System.out.println("Введите количество символов в массиве:");
                    int n = scanner.nextInt();
                    System.out.println("Вводите массив:");
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Число которое нужно найти:");
                    int x16 = scanner.nextInt();
                    System.out.println("Поиск первого значения: " + findFirst(arr, x16));
                    break;
                case 17:
                    System.out.println("Введите массив и число:");
                    System.out.println("Введите количество символов в массиве:");
                    n = scanner.nextInt();
                    System.out.println("Вводите массив:");
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Число которое нужно найти:");
                    x16 = scanner.nextInt();
                    System.out.println("Поиск последнего значения: " + findLast(arr, x16));
                    break;
                case 18:
                    System.out.println("Введите массив:");
                    System.out.println("Введите количество символов в массиве:");
                    n = scanner.nextInt();
                    System.out.println("Вводите массив:");
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Поиск максимального по модулю: " + maxAbs(arr));
                    break;
                case 19:
                    System.out.println("Введите массив, число и позицию.:");
                    System.out.println("Введите количество символов в массиве:");
                    n = scanner.nextInt();
                    System.out.println("Вводите массив:");
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Число которое нужно добавить:");
                    int x19 = scanner.nextInt();
                    System.out.println("Введите позицию добавление числа:");
                    int pos = scanner.nextInt();
                    int[] newArr = add(arr, x19, pos);
                    System.out.println("Добавление в массив: " + java.util.Arrays.toString(newArr));
                    break;
                default:
                    System.out.println("Неправильный ввод");
                }
            }catch (InputMismatchException e) {
                    System.out.println("Неправильный ввод. Попробуйте еще раз.");
                    scanner.next();
                }
        }
    }
    // ниже исполнение всех функций для приложений
    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    public static int charToNum(char x) {
        return x - '0';
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return x >= 10 && x < 100;
    }

    public static int abs(int x) {
        return x >= 0 ? x : -x;
    }

    public static double safeDiv(int x, int y) {
        return y == 0 ? 0 : (double) x / y;
    }

    public static boolean is35(int x) {
        return x % 3 == 0 ^ x % 5 == 0;
    }

    public static String makeDecision(int x, int y) {
        if (x < y) {
            return x + " < " + y;
        } else if (x > y) {
            return x + " > " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public static String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public static String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static int numLen(long x) {
        int length = 0;
        while (x > 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int maxAbs(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }
        return max;
    }
    
    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        
        // Копировать элементы массива arr до позиции pos
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        
        // Копировать элементы массива ins
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        
        // Копировать оставшиеся элементы массива arr
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + i - pos] = arr[i];
        }
        
        return result;
    }
}
