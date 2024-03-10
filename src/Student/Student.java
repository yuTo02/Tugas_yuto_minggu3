package Student;

public class Student {
    private String StudentName;
    private String StudentNim;
    private double StudentGpa;

    // Constructors
    public Student(String StudentName, String StudentNim, double StudentGpa) {
        this.StudentName = StudentName;
        this.StudentNim = StudentNim;
        this.StudentGpa = StudentGpa;
    }

    // Getter
    public String getStudentName() {
        return StudentName;
    }

    public String getStudentNim() {
        return StudentNim;
    }

    public double getStudentGpa() {
        return StudentGpa;
    }

    // Setter
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setStudentNim(String StudentNim) {
        this.StudentNim = StudentNim;
    }

    public void setStudentGpa(double StudentGpa) {
        this.StudentGpa = StudentGpa;
    }
}
