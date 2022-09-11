import java.util.Objects;

public class Employee {


    private String fio;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    // Getter's
    public int getId() {
        return this.id;
    }

    public int getDepartment() {
        return this.department;
    }

    public String getFIO() {
        return this.fio;
    }

    public int getSalary() {
        return this.salary;
    }


    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public void SetDepartment(int department) {
        this.department = department;
    }

    public void setId() {
        this.id = getId();
    }


    @Override
    public String toString() {
        return id + " " + fio + " " + department + " " + salary;

    }


    public Employee(String fio1, int dep, int sal) {
        fio = fio1;
        department = dep;
        salary = sal;
        id = counter++;


    }

}
