package lab5;

// Класс Дробь
public class Fraction implements FractionOperations {
    private int numerator;    // Числитель
    private int denominator;  // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        // Убедимся, что знаменатель всегда положительный
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // Получение строкового представления
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Получение вещественного значения
    @Override
    public double getValue() {
        return (double) numerator / denominator; // Возвращаем вещественное значение
    }

    // Установка числителя
    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Установка знаменателя
    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        // Убедимся, что знаменатель всегда положительный
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
    }

    // Переопределение equals для сравнения дробей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение с самим собой
        if (!(obj instanceof Fraction other)) return false; // Если это не дробь, возвращаем false
        return this.numerator * other.denominator == this.denominator * other.numerator; // Сравнение
    }
}
