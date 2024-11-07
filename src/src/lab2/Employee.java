package lab2;

class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null) {
            department.addEmployee(this); // Добавляем сотрудника в отдел
        }
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        if (department.getManager() != null) {
            // Если текущий сотрудник - менеджер, то его начальником будет он сам
            if (department.getManager().equals(this)) {
                return name + " начальник отдела " + department.getName() + ", начальник которого " + name;
            } else {
                return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getManager().getName();
            }
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого нет";
        }
    }
}
