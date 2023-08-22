import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee("Шварценеггер Арнольд Иванович " + i, "Отдел " + i, 10000 + i);
            Employee employee = employees[i];
            System.out.println(employee.getId() + " " + employee.getDataEmployers() + " " + employee.getDepartments() + " " + employee.getSalary());
        }
        System.out.print(Arrays.toString(employees));


        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
            System.out.println(sum);
        }
    }
}
