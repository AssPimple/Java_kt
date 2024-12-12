package lab5;

public class Funs {
    public static void meowsCare(Meowable m) {
        for (int i = 0; i < 5; i++) { // Кот мяукает 5 раз
            m.meow();
            try {
                Thread.sleep(1000); // Задержка 1 секунда между мяуканьями
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}