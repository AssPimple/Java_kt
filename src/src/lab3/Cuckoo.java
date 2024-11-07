package lab3;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        // Количество "ку-ку" от 1 до 10
        int times = random.nextInt(10) + 1;
        for (int i = 0; i < times; i++) {
            System.out.print("ку-ку "); // Пение кукушки
        }
        System.out.println();
    }
}