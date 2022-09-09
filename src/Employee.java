import java.util.Objects;

public class Employee {


    private String fio;
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
        return this.fio;
    }

    public int getSalary() {
        return this.Salary;
    }


    public void SetFIO(String fio) {
        this.fio = fio;
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
        return   Id+ " "+fio + " " + Department +" "+ Salary;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Department == employee.Department && Salary == employee.Salary && Id == employee.Id && fio.equals(employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, Department, Salary, Id);
    }


    public Employee(String fio1, int department, int salary) {
        fio = fio1;
        Department = department;
        Salary = salary;
        Id = Counter++;


    }

}
