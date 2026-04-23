import java.util.HashMap;
import java.util.Map;

class EmployeeService {
    private HashMap<Integer, Employee> employees = new HashMap<>();

    // Add Employee
    public void addEmployee(Employee emp) {
        if (employees.containsKey(emp.getId())) {
            System.out.println("Employee ID already exists!");
            return;
        }
        employees.put(emp.getId(), emp);
        System.out.println("Employee added successfully!");
    }

    // View All Employees
    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            entry.getValue().display();
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {
        return employees.get(id); // O(1)
    }

    // Update Employee
    public void updateEmployee(int id, String name, double salary) {
        if (employees.containsKey(id)) {
            Employee emp = employees.get(id);
            emp.setName(name);
            emp.setSalary(salary);
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }
}