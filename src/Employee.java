import java.util.Objects;

public class Employee {


    private String FIO;
    private int Department;
    private int Salary;
    private static int Counter = 0;
    private int Id;

    // Getter's
    public int getId() {
        return this.Id;
    }

    public int getDepartment() {
        return this.Department;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getSalary() {
        return this.Salary;
    }

    // Setter's
    public void SetFIO(String fio) {
        this.FIO = fio;
    }

    public void SetSalary(int salary) {
        this.Salary = salary;
    }

    public  void SetDepartment(int department) {
        this.Department = department;
    }

    public  void setId() {
        this.Id = getId();
    }


    @Override
    public String toString() {
        return   Id+ " "+FIO + " " + Department +" "+ Salary;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Department == employee.Department && Salary == employee.Salary && Id == employee.Id && FIO.equals(employee.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, Department, Salary, Id);
    }

    // Constructor
    public <salary> Employee(String fio, int department, int salary) {
        FIO = fio;
        Department = department;
        Salary = salary;
        Id = Counter++;


    }

}
