public class Main {
    public static String resultAllEmployeeDetails(Employee[] employee) {

        String result = employee[0].getFIO();
        for (int i = 1; i < employee.length; i++) {


            System.out.println(employee[i].getFIO());


        }
        return result;
    }

    public static String resultFio(Employee[] employees) {
        for (int i = 0; i < Main.employee.length; i++)
            System.out.println(Main.employee[i].toString());
        return null;
    }

    public static String resultAllData(Employee[] employee, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                return employee[i].toString();
            }
        }


        return null;
    }

    public static int salarySum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }

        return sum;
    }

    public static int salaryMin(Employee[] employee) {
        int result = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp > employee[i].getSalary()) {
                result = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }

        return result;
    }

    public static int salaryAverage(Employee[] employee) {

        return salarySum(employee) / employee.length;
    }

    public static int salaryMax(Employee[] employee) {
        int result = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp < employee[i].getSalary()) {
                result = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }

        return result;
    }

    public static Employee[] employee = new Employee[10];



    public static void main(String[] args) {

        Employee e = new Employee("Валя", 1, 1_000);
        Employee e1 = new Employee("Влад", 5, 300);
        Employee e2 = new Employee("Леша", 3, 70);
        Employee e3 = new Employee("Саша", 1, 120);
        Employee e4 = new Employee("Люся", 4, 375);
        Employee e5 = new Employee("Лера", 3, 345);
        Employee e6 = new Employee("Вася", 5, 12);
        Employee e7 = new Employee("Зина", 1, 18);
        Employee e8 = new Employee("Лера", 2, 19);
        Employee e9 = new Employee("Женя", 4, 60);
        employee[0] = e;
        employee[1] = e1;
        employee[2] = e2;
        employee[3] = e3;
        employee[4] = e4;
        employee[5] = e5;
        employee[6] = e6;
        employee[7] = e7;
        employee[8] = e8;
        employee[9] = e9;

        System.out.println(resultFio(employee));
        System.out.println(resultAllEmployeeDetails(employee));
        System.out.println("sum = " + salarySum(employee));
        System.out.println("ave = " + salaryAverage(employee));
        System.out.println(" min " + resultAllData(employee, salaryMin(employee)));
        System.out.println(" max " + resultAllData(employee, salaryMax(employee)));

    }


}