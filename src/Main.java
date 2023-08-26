import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static int sumSalary() { // сумма зарплат в месяц
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static int minSalary() { // минимальная зарплата
        int minWaste = Integer.MAX_VALUE;
        for (Employee number : employees) {
            if (number.getSalary() < minWaste) {
                minWaste = number.getSalary();
            }
        }
        return minWaste;
    }

    public static int averageSalary() { // средняя зарплата
        int middle = sumSalary() / employees.length;
        return middle;
    }
    public static int maxSalary() { // максимальная зарплата
        int maxWaste = 0;
        for (Employee number1 : employees) {
            if (number1.getSalary() > maxWaste) {
                maxWaste = number1.getSalary();
            }
        }
        return maxWaste;
    }

    public static void main(String[] args) { // выводим toString
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee("Шварценеггер Арнольд Иванович " + i + " ; ", " " + i + " ; ", 10000 + i);
            System.out.println(employees[i]);
        }
        for (int i = 0; i < 10; i++) { // выводим ФИО
            employees[i] = new Employee("Шварценеггер Арнольд Иванович " + i + "; ", " " + i + " ; ", 10000 + i);
          Employee employee = employees[i];
            System.out.println(employee.getDataEmployers());
        }
        int total = sumSalary();
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + total + " рублей.");
        int total1 = minSalary();
        System.out.println("Минимальная зарплата в месяц составляет " + total1 + " рублей.");
        int total2 = maxSalary();
        System.out.println("Максимальная зарплата в месяц составляет " + total2 + " рублей.");
        int total3 = averageSalary();
        System.out.println("Средняя зарплата в месяц составляет " + total3 + " рублей.");
    }

}