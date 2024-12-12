package lab4;

// Класс для представления коробки
class Box<T> {
    private T item;

    // Конструктор
    public Box() {
        this.item = null; // Изначально коробка пуста
    }

    // Метод для помещения объекта в коробку
    public void putItem(T item) throws Exception {
        if (this.item != null) {
            throw new Exception("Коробка уже заполнена. Сначала заберите объект.");
        }
        this.item = item;
    }

    // Метод для извлечения объекта из коробки
    public T getItem() throws Exception {
        if (this.item == null) {
            throw new Exception("Коробка пуста. Нельзя забрать объект.");
        }
        T temp = this.item;
        this.item = null; // Обнуляем ссылку на объект
        return temp;
    }

    // Метод проверки на заполненность
    public boolean isEmpty() {
        return this.item == null;
    }

    // Метод toString
    @Override
    public String toString() {
        if (this.item == null) {
            return "Коробка пуста";
        }
        return "Коробка содержит: " + this.item.toString();
    }
}
