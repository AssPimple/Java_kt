package lab3;

class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
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
            if (department.getManager().equals(this)) {
                return name + " начальник отдела " + department.getName();
            } else {
                return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getManager().getName();
            }
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого отсутствует.";
        }
    }
}