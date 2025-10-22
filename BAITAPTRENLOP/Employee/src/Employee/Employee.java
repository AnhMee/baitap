// Lớp cha: Employee
class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Phương thức tính lương - sẽ được override ở lớp con
    public double calculateSalary() {
        return 0;
    }

    public String getName() {
        return name;
    }
}

// Lớp con 1: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double baseSalary;  // lương cơ bản
    private double bonus;       // tiền thưởng

    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Lớp con 2: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int workingHours;   // số giờ làm
    private double hourlyRate;  // lương theo giờ

    public PartTimeEmployee(String name, int workingHours, double hourlyRate) {
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}