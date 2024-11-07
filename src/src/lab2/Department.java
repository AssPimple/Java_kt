package lab2;

import java.util.ArrayList;
import java.util.List;

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
