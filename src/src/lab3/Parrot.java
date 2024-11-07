package lab3;

public class Parrot extends Bird {
    private final String text; // Текст, который будет петь попугай

    public Parrot(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Текст не может быть пустым.");
        }
        this.text = text;
    }

    @Override
    public void sing() {
        int n = random.nextInt(text.length()) + 1; // Случайное длина для пения
        System.out.println(text.substring(0, n)); // Выводим N символов текста
    }
}