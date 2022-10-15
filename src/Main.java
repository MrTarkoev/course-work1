public class Main {
    public static void main(String[] args) {
        Employee[] a=new Employee[10];
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                a[i] = null;
                if(i==a.length%2 || i==a.length%2+1){
                    a[i] = new Employee("john"+i,0,0);
                    a[i].setDepartment(i/5);
                    a[i].setSalary(i*10+100);
                }
            }
        }
        Employee.getEmployeesInfoList(a);
        Employee.getEmployeesNameList(a);
        Employee.getSalaryCosts(a);
        Employee.getMinSalaryEmployee(null);
    }

}
