package lab3;

public class Point {
    private final double x; // Координата X
    private final double y; // Координата Y

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, если сравниваемый объект является экземпляром Point
        if (this == obj) return true; // Сравниваем ссылки
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и совпадение классов

        Point point = (Point) obj; // Приведение типа
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0; // Сравниваем координаты
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x); // Получаем хеш-код для координаты X
        result = 31 * result + Double.hashCode(y); // Получаем хеш-код для координаты Y
        return result; // Возвращаем общий хеш-код
    }

    public double getX() { return x; } // Геттер для X
    public double getY() { return y; } // Геттер для Y
}
