public class Employee {
    private String dataEmployers;
    private String departments;
    private int salary;
    private static int count;
    private final int id;


    public Employee(String dataEmployers, String departments, int salary) {
        count ++;
        this.id = count;
        this.dataEmployers = dataEmployers;
        this.departments = departments;
        this.salary = salary;
    }

    public String getDataEmployers() {

        return dataEmployers;
    }

    public String getDepartments() {
        return departments;
    }
    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
    public void setDepartments(String departments) {
        this.departments = departments;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО = " + dataEmployers + " Отдел = " + departments + " Зарплата = " + salary;
    }
}