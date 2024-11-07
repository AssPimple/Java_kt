package lab3;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Department(String name, Employee manager) {
        this.name = name;
        setManager(manager); // Инициализируем менеджера через сеттер
        this.employees = new ArrayList<>();
        if (manager != null) {
            employees.add(manager);
        }
    }

    public void setManager(Employee manager) {
        if (manager != null && !manager.getDepartment().equals(this)) {
            throw new RuntimeException("Менеджер должен работать в своем департаменте.");
        }
        this.manager = manager;
        if (manager != null) {
            this.addEmployee(manager);
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
