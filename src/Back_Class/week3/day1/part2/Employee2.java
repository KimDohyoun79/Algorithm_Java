package Back_Class.week3.day1.part2;

public class Employee2 {
    private String name;
    private int age;
    private String rank;
    private int salary;

    public Employee2(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.setSalary();
    }

    private void setSalary() {
        if (this.rank.equals("사원")) {
            this.salary = 10_000_00;
        }else if (this.rank.equals("대리")) {
            this.salary = 20_000_00;
        }else if (this.rank.equals("과장")) {
            this.salary = 30_000_00;
        }else if (this.rank.equals("차장")) {
            this.salary = 40_000_00;
        }else if (this.rank.equals("부장")) {
            this.salary = 50_000_00;
        }
    }

    public static void main(String[] args) {
        Employee2 employee = new Employee2("김경록", 36, "차장");
    }
}
