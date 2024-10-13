package Task3;

// Базовий клас "Працівник"
class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Похідний клас "Працівник на погодинній оплаті"
class HourlyEmployee extends Employee {
    private final double hourlyRate;

    public HourlyEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return "Погодинний працівник: " + getName() + ", ставка: " + getHourlyRate();
    }
}

// Похідний клас "Працівник на окладі"
class SalariedEmployee extends Employee {
    private final double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Працівник на окладі: " + getName() + ", зарплата: " + getSalary();
    }
}

// Клас "Підприємство"
class Enterprise {
    private final Employee[] employees;
    private int employeeCount;

    public Enterprise(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }

    // Додаємо працівників
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        } else {
            System.out.println("Підприємство заповнене, не можна додати більше працівників.");
        }
    }

    // Працівники на погодинній оплаті
    public int countHourlyEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    // Працівники на окладі
    public int countSalariedEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                count++;
            }
        }
        return count;
    }

    public void printEmployees() {
        System.out.println("Список працівників:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Enterprise enterprise = new Enterprise(5);

        // Додавання працівників
        enterprise.addEmployee(new HourlyEmployee("Олексій Петрович", 150));
        enterprise.addEmployee(new SalariedEmployee("Марія Сергіївнв", 3000));
        enterprise.addEmployee(new HourlyEmployee("Іван Івановвич", 125));
        enterprise.addEmployee(new SalariedEmployee("Анна Дмитрівна", 4500));

        System.out.println("Кількість працівників на погодинній оплаті: " + enterprise.countHourlyEmployees());
        System.out.println("Кількість працівників на окладі: " + enterprise.countSalariedEmployees());

        enterprise.printEmployees();
    }
}
