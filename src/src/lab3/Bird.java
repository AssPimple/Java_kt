package lab3;

import java.util.Random;

public abstract class Bird {
    protected static final Random random = new Random(); // Случайный генератор

    public abstract void sing(); // Абстрактный метод для пения
}