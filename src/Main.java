import java.util.Arrays;

public class Main {
    public static int sumSalary(Employee[] employee) { // сумма зарплат в месяц
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[] employee) { // минимальная зарплата
        Employee[] employees = new Employee[10];
        int minWaste = 10000;
        for (Employee number : employee) {
            if (number.getSalary() < minWaste) {
                minWaste = number.getSalary();
            }
        }
        return minWaste;
    }

    public static int averageSalary(Employee[] employee) { // средняя зарплата
        int middle = sumSalary(employee) / employee.length;
        return middle;
    }
    public static int maxSalary(Employee[] employee) { // максимальная зарплата
        int maxWaste = 10000;
        for (Employee number1 : employee) {
            if (number1.getSalary() > maxWaste) {
                maxWaste = number1.getSalary();
            }
        }
        return maxWaste;
    }

    public static void main(String[] args) { // выводим toString
        Employee[] employees = new Employee[10];
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee("Шварценеггер Арнольд Иванович " + i + " ; ", " " + i + " ; ", 10000 + i);
            Employee employee = employees[i];
            System.out.println(employees[i]);
        }
        for (int i = 0; i < 10; i++) { // выводим ФИО
            employees[i] = new Employee("Шварценеггер Арнольд Иванович " + i + "; ", " " + i + " ; ", 10000 + i);
            Employee employee = employees[i];
            System.out.println(employee.getDataEmployers());
        }
        int total = sumSalary(employees);
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + total + " рублей.");
        int total1 = minSalary(employees);
        System.out.println("Минимальная зарплата в месяц составляет " + total1 + " рублей.");
        int total2 = maxSalary(employees);
        System.out.println("Максимальная зарплата в месяц составляет " + total2 + " рублей.");
        int total3 = averageSalary(employees);
        System.out.println("Средняя зарплата в месяц составляет " + total3 + " рублей.");
    }

}