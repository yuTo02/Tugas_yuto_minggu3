import java.util.Scanner;
import Employee.Employee;
import BankAccount.BankAccount;
import Student.Student;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==Form Input Employee Data ==");
        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter employee position: ");
        String employeeEmployment = input.nextLine();
        System.out.print("Enter employee salary: ");
        double employeeSalary = input.nextDouble();
        input.nextLine(); // Membuang newline

        // Membuat objek Employee berdasarkan input pengguna
        Employee employee = new Employee(employeeName, employeeEmployment, employeeSalary);
        System.out.println("== Employee Data Information ==");
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Position: " + employee.getEmployment());
        System.out.printf("Employee Salary:  %.2f%n", employee.getSalary());
        System.out.printf("Employee Pay:  %.2f%n", employee.calculatePayment());

        System.out.println("----------------");

        System.out.println("==Form Input Bank Account Data ==");
        System.out.print("Enter account number: ");
        String accountNumber = input.next();
        System.out.print("Enter account balance: ");
        double accountBalance = input.nextDouble();
        input.nextLine(); // Membuang newline

        // Membuat objek BankAccount berdasarkan input pengguna
        BankAccount bankAccount = new BankAccount(accountNumber, accountBalance);
        System.out.println("== Bank Account Information ==");
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.printf("Account Balance: %.2f%n", bankAccount.getBalance());

        System.out.println("----------------");

        System.out.println("==Form Input Student Data ==");
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter student NIM: ");
        String studentNIM = input.nextLine();
        System.out.print("Enter student GPA: ");
        double studentGPA = input.nextDouble();

        // Membuat objek Student berdasarkan input pengguna
        Student student = new Student(studentName, studentNIM, studentGPA);
        System.out.println("== Student Data Information ==");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student NIM: " + student.getStudentNim());
        System.out.println("Student GPA: " + student.getStudentGpa());

        input.close(); // Menutup Scanner
    }
}