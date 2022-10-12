import java.util.Objects;

public class Employee {
    static int id=0;
    String name;
    int department;
    int salary;
    int employeeId;
    public Employee(String name, int department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.employeeId = id;
        id++;
    }

    public int getId() {
        return employeeId;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return name+", id: "+employeeId+", "+department+" department, "+salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeId);
    }
    public static void getSalaryCosts(Employee[] employees){
        if (employees != null) {
            int salaryCosts=0;
            for (int i = 0; i < employees.length; i++) {
                salaryCosts += employees[i].getSalary();
            }
            System.out.println("Salary costs: "+salaryCosts);
        }else {
            System.out.println("null");
        }
    }
    public static void getMinSalaryEmployee(Employee[] employees){
        if (employees != null) {
            if (employees.length >= 1) {
                Employee minSalaryEmployee = employees[0];
                int minSalary = minSalaryEmployee.getSalary();
                for (int i = 1; i < employees.length; i++) {
                    int curSalary = employees[i].getSalary();
                    if(curSalary < minSalary){
                        minSalary = curSalary;
                        minSalaryEmployee = employees[i];
                    }
                }
                System.out.println(minSalaryEmployee);
            }else{
                System.out.println("null");
            }
        }
    }
    public static void getMaxSalaryEmployee(Employee[] employees){
        if (employees != null) {
            int maxSalary = 0;
            Employee maxSalaryEmployee = null;
            for (int i = 0; i < employees.length; i++) {
                int curSalary = employees[i].getSalary();
                if(curSalary>maxSalary){
                    maxSalary = curSalary;
                    maxSalaryEmployee = employees[i];
                }
            }
            System.out.println(maxSalaryEmployee);
        }
    }
    public static void getAvgSalary(Employee[] employees){
        if (employees != null) {
            double avgSalary = 0.0;
            for (int i = 0; i < employees.length; i++) {
                avgSalary += employees[i].getSalary();
            }
            avgSalary = avgSalary/employees.length;
            System.out.println(avgSalary);
        } else{
            System.out.println("null");
        }
    }
    public static void getEmployeesNameList(Employee[] employees){
        if (employees != null) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getName());
            }
        } else {
            System.out.println("null");
        }
    }
    public static void getEmployeesInfoList(Employee[] employees){
        if (employees != null) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }else{
            System.out.println("null");
        }
    }

}
