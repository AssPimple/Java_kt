package lab3;

public class Time {
    private int seconds;

    // Конструктор для создания времени по количеству секунд с начала суток
    public Time(int seconds) {
        setSeconds(seconds);
    }

    // Конструктор для создания времени по часам, минутам и секундам
    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Геттер для получения секунд
    public int getSeconds() {
        return seconds;
    }

    // Метод для установки секунд с проверкой диапазона
    public void setSeconds(int seconds) {
        if (seconds < 0) {
            throw new RuntimeException("Количество секунд не может быть отрицательным.");
        }
        this.seconds = seconds % 86400; // 86400 секунд в сутках
    }

    // Метод для получения часов
    public int getHours() {
        return seconds / 3600;
    }

    // Метод для установки часов
    public void setHours(int hours) {
        if (hours < 0) {
            throw new RuntimeException("Количество часов не может быть отрицательным.");
        }
        seconds = (seconds % 3600) + (hours % 24) * 3600; // Поддержка текущих минут и секунд
    }

    // Метод для получения минут
    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    // Метод для установки минут
    public void setMinutes(int minutes) {
        if (minutes < 0) {
            throw new RuntimeException("Количество минут не может быть отрицательным.");
        }
        seconds = (seconds / 3600) * 3600 + (minutes % 60) * 60 + (seconds % 60); // Поддержка текущих часов и секунд
    }


    // Метод для преобразования времени в строковый формат
    public String toString() {
        int hours = getHours();
        int minutes = getMinutes();
        int secs = getSeconds();

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }

    // Тестирование класса
    public static void main(String[] args) {
        Time time1 = new Time(3661); // 1 час, 1 минута, 1 секунда
        System.out.println(time1); // 01:01:01

        Time time2 = new Time(25, 61, 70); // 25 часов, 61 минута, 70 секунд
        System.out.println(time2); // 02:02:10

        time1.setSeconds(100000); // 100000 секунд
        System.out.println(time1); // 13:46:40

        time1.setHours(5); // Установить 5 часов
        System.out.println(time1); // Пример изменения

        try {
            time1.setMinutes(-1); // Вызывает исключение
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Количество минут не может быть отрицательным.
        }
    }
}