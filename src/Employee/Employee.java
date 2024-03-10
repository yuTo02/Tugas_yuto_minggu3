package Employee;

public class Employee implements Payable {
    private String EmployeeName;
    private String Employment;
    private double Salary;

    // Constructor
    public Employee(String EmployeeName, String Employment, double Salary) {
        this.EmployeeName = EmployeeName;
        this.Employment = Employment;
        this.Salary = Salary;
    }

    // Getter
    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployment() {
        return Employment;
    }

    public double getSalary() {
        return Salary;
    }

    // Setter
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public void setEmployment(String Employment) {
        this.Employment = Employment;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public double calculatePayment() {
        return Salary;
    }
}
