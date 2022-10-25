package Back_Class.week3.day1.part2;

public class Employee3 {
    private String name;
    private int age;
    private String rank;
    private int salary;

    public Employee3(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.setSalary();
    }

    private void setSalary() {
        switch (this.rank) {
            case "사원": this.salary = 10_000_00;
            case "대리": this.salary = 30_000_00;
            case "과장": this.salary = 40_000_00;
            case "차장": this.salary = 50_000_00;
            case "부장": this.salary = 60_000_00;
        }
    }

    public static void main(String[] args) {
        Employee3 employee = new Employee3("김경록", 36, "차장");
    }
}
