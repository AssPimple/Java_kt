package lab2;

public class Time {
    private int seconds;

    // Конструктор для создания времени по количеству секунд с начала суток
    public Time(int seconds) {
        this.seconds = seconds % 86400; // 86400 секунд в сутках
    }

    // Конструктор для создания времени по часам, минутам и секундам
    public Time(int hours, int minutes, int seconds) {
        // Избыток времени не будет влиять на хранение.
        this.seconds = (Math.abs(hours) % 24) * 3600 + (Math.abs(minutes) % 60) * 60 + (Math.abs(seconds) % 60);
        // Ограничиваем значение до 24 часов
    }

    // Метод для получения текущего часа
    public int getHours() {
        return seconds / 3600;
    }

    // Метод для получения минут, прошедших с начала текущего часа
    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    // Метод для получения секунд, прошедших с начала текущей минуты
    public int getSeconds() {
        return seconds % 60;
    }

    // Метод для преобразования времени в строковый формат
    public String toString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }

}