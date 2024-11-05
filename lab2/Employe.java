package lab2;

import java.util.ArrayList;
import java.util.List;

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


class Department {
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
        this.employees = new ArrayList<>();
        if (manager != null) { // добавляем менеджера в список сотрудников
            employees.add(manager);
        }
    }
    public void setManager(Employee manager) {
        this.manager = manager;
        if (manager != null) {
            this.addEmployee(manager); // Убедитесь, что менеджер добавлен в список сотрудников
        }
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}