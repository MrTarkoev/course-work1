public class Main {
    public static void main(String[] args) {
        Employee[] a=null;
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                a[i] = new Employee("john"+i,0,0);
                a[i].setDepartment(i/5);
                a[i].setSalary(i*10+100);
            }
        }
    }
}
