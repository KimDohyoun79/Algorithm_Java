package Back_Class.week3;

public class AtOnce {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;


    public static int plus(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        return a + b;
    }

    public static int minus(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(plus(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(minus(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
    }
}
