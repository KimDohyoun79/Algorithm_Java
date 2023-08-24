package LikeLion_Back2_Class.domain;

public class Patient2 {
    private String name;
    private int age;

    public Patient2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object receivedObj) {
        Patient2 patient = (Patient2) receivedObj;
        return (patient.name.equals(this.name) && patient.age == this.age);
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }

}
