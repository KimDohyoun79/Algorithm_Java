package Back_Class.week2;


public class SwitchCaseExercise {
    //  사칙연산 계산기 만들기
    public void operation(String operator, int a, int b) {
        switch (operator) {
            case "+": System.out.println("num1:"+a+" num2:"+b+ "   " +(a + b)); break;
            case "-": System.out.println("num1:"+a+" num2:"+b+ "   " +(a - b)); break;
            case "*": System.out.println("num1:"+a+" num2:"+b+ "   " +(a * b)); break;
            case "/": System.out.println("num1:"+a+" num2:"+b+ "   " +(a / b)); break;
        }
    }

    public static void main(String[] args) {
        // test operation
//        Scanner sc = new Scanner(System.in);
//        String operator = sc.next();
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        SwitchCaseExercise sce = new SwitchCaseExercise();
        sce.operation("+", 10, 20);
        sce.operation("-", 10, 20);
        sce.operation("*", 10, 20);
        sce.operation("/", 10, 20);
    }
}

