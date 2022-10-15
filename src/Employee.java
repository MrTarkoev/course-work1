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
        return "Name: "+name+",  ID: "+employeeId+",  Department: "+department+",  Salary: "+salary;
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
    public static void errorMes(){
        System.out.println("Ошибка! Обратитесь к администратору.");
    }
    public static void getSalaryCosts(Employee[] employees){
        if (employees != null) {
            int salaryCosts=0;
            int countOfNullPointers=0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    countOfNullPointers++;
                }else{
                    salaryCosts += employees[i].getSalary();
                }
            }
            if(countOfNullPointers==employees.length){
                errorMes();
            }else{
                System.out.println("Salary costs: "+salaryCosts);
            }
        }else {
            errorMes();
        }
    }
    public static void getMinSalaryEmployee(Employee[] employees){
        if (employees != null) {
            if (employees.length >= 1) {
                Employee minSalaryEmployee = employees[0];
                int minSalary = (minSalaryEmployee==null)?0:minSalaryEmployee.getSalary();
                for (int i = 1; i < employees.length; i++) {
                    if(employees[i]==null){
                        continue;
                    }
                    int curSalary = employees[i].getSalary();
                    if(curSalary < minSalary){
                        minSalary = curSalary;
                        minSalaryEmployee = employees[i];
                    }
                }
                if (minSalaryEmployee != null) {
                    System.out.println(minSalaryEmployee);
                } else {
                    errorMes();
                }
            }else{
                errorMes();
            }
        }
        else{errorMes();}
    }
    public static void getMaxSalaryEmployee(Employee[] employees){
        if (employees != null) {
            int maxSalary = 0;
            Employee maxSalaryEmployee = null;
            for (int i = 0; i < employees.length; i++) {
                if(employees[i] == null){
                    continue;
                }
                int curSalary =employees[i].getSalary();
                if(curSalary>maxSalary){
                    maxSalary = curSalary;
                    maxSalaryEmployee = employees[i];
                }
            }
            if(maxSalaryEmployee!=null){
                System.out.println(maxSalaryEmployee);
            }else{
                errorMes();
            }
        }else {
            errorMes();
        }
    }
    public static void getAverageSalary(Employee[] employees){
        if (employees != null) {
            double avgSalary = 0.0;
            int countOfNullPointers  = 0;
            int countOfEmployees  = employees.length;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    countOfNullPointers++;
                    countOfEmployees--;
                }else{
                    avgSalary += employees[i].getSalary();
                }
            }
            if(countOfNullPointers==employees.length){
                errorMes();
            }else{
                avgSalary = avgSalary/countOfEmployees;
                System.out.println(avgSalary);
            }
        } else{
            errorMes();

        }
    }
    public static void getEmployeesNameList(Employee[] employees){
        if (employees != null) {
            int countOfNullPointers = 0;
            for (int i = 0; i < employees.length; i++) {
                if(employees[i]!=null){
                    System.out.println(employees[i].getName());
                }else{
                    countOfNullPointers++;
                }
            }
            if(countOfNullPointers == employees.length){
                errorMes();
            }
        } else {
            errorMes();
        }
    }
    public static void getEmployeesInfoList(Employee[] employees){
        if (employees != null) {
            int countOfNullPointers = 0;
            for (int i = 0; i < employees.length; i++) {
                if( employees[i]!=null){
                    System.out.println(employees[i]);
                }else {
                    countOfNullPointers++;
                }
            }
            if(countOfNullPointers == employees.length){
                errorMes();
            }
        }else{
            errorMes();

        }
    }

}
