package LikeLion_Back2_Class.week3.day1.part2;

public class Employee {
    private String name;
    private int age;
    private String rank;
    private int salary;

    public Employee(String name, int age, String rank, int salary) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("김경록", 36, "차장", 60_000_000);
    }
}
