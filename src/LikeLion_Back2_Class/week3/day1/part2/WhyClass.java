package LikeLion_Back2_Class.week3.day1.part2;

public class WhyClass {
    private int a, b;

    public WhyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return this.a + this.b;
    }
    public int minus() {
        return this.a - this.b;
    }
    public int multiple() {
        return this.a * this.b;
    }
    public int divide() {
        return this.a / this.b;
    }

    public void printAllResults() {
        System.out.println(this.plus());
        System.out.println(this.minus());
        System.out.println(this.multiple());
        System.out.println(this.divide());
    }

    public static void main(String[] args) {
        WhyClass wc = new WhyClass(10, 20);
        wc.printAllResults();

    }
}
