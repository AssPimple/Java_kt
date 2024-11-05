package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x){
            case 1:
                // Тестирование с использованием различных входных данных
                Time time1 = new Time(34056); // 9 часов, 26 минут, 36 секунд
                Time time2 = new Time(25, 0, 0); // 1 час (25 часов – это больше 24, отбрасывается)
                Time time3 = new Time(0, 500, 0); // 01:15:00 (75 минут – это 1 час 15 минут)
                Time time4 = new Time(23, 59, 59); // 23:59:59 (максимально возможное время)

                // Вывод результата на экран
                System.out.println("Время 1 (34056 секунд): " + time1); // ожидание: 09:26:36
                System.out.println("Время 2 (25 часов): " + time2); // ожидание: 01:00:00 (т.к. 25 часов отбрасываются)
                System.out.println("Время 3 (0 часов, 504 минут): " + time3); // ожидание: 01:15:00 (75 минут)
                System.out.println("Время 4 (23 часа, 59 минут, 59 секунд): " + time4); // ожидание: 23:59:59
        }
    }
}
