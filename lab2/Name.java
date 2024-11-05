package lab2;

class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    // Конструктор с параметрами
    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    // Конструктор без параметров
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Метод toString для отображения имени

    public String toString() {
        StringBuilder fullName = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName).append(" ");
        }
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(firstName).append(" ");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(patronymic);
        }
        return fullName.toString().trim();  // Возвращаем итоговую строку
    }
}
