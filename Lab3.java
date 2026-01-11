class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ajay", 50000);
        Employee emp2 = new Employee(102, "Brijesh", 45000);

        System.out.println("Before Salary Raise:");
        emp1.display();
        System.out.println();
        emp2.display();

        emp1.raiseSalary(10);  // 10% raise
        emp2.raiseSalary(5);   // 5% raise

        System.out.println("\nAfter Salary Raise:");
        emp1.display();
        System.out.println();
        emp2.display();

        System.out.println(emp1.getId());
        System.out.println(emp2.getId());
    }
}
