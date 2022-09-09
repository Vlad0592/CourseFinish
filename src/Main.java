public class Main {


    public static String resultFioFIO(Employee[] employee) {
        double tmpId2 = 0;
        String tmp = employee[0].getFIO();
        for (int i = 1; i < employee.length; i++) {
            tmpId2 = employee[i].getId();
            System.out.println(employee[i].getFIO());
        }
        return tmp;
    }

    public static int resultFio(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].toString());
        return 0;
    }


    public static String resultFioToString(Employee[] employee, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                return employee[i].toString();
            }
        }
        return "none";
    }


    public static int salarySum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }

        return sum;
    }

    public static int salaryMin(Employee[] employee) {
        int tmpId1 = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp > employee[i].getSalary()) {
                tmpId1 = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }

        return tmpId1;
    }

    public static int salaryAverage(Employee[] employee) {

        return salarySum(employee) / employee.length;
    }

    public static int salaryMax(Employee[] employee) {
        int tmpId = 0;
        int tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp < employee[i].getSalary()) {
                tmpId = employee[i].getId();
                tmp = employee[i].getSalary();
            }

        }

        return  tmpId;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("bobych", 1, 1_000);
        employee[1] = new Employee("bobych", 2, 50);
        employee[2] = new Employee("bobych", 3, 100);
        employee[3] = new Employee("bobych", 4, 200);
        employee[4] = new Employee("bobych", 5, 2400);
        employee[5] = new Employee("bobych", 5, 111);
        employee[6] = new Employee("bobych", 1, 525);
        employee[7] = new Employee("bobych", 2, 240);
        employee[8] = new Employee("bobych", 3, 230);
        employee[9] = new Employee("bobych", 4, 250);


        System.out.println(resultFio(employee));
        System.out.println(resultFioFIO(employee));
        System.out.println("sum = " + salarySum(employee));
        System.out.println("ave = " + salaryAverage(employee));
        System.out.println(" min " + resultFioToString(employee, salaryMin(employee)));
        System.out.println(" max " + resultFioToString(employee, salaryMax(employee)));

    }


}