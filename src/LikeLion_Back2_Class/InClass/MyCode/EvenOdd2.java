package LikeLion_Back2_Class.InClass.MyCode;/*
    https://codeup.kr/problem.php?id=1161&rid=0
    정수 두개가 입력으로 들어온다.
    만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
    그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 결과로 나오는 값이 홀수인지 짝수인지 출력한다.

    예를들어,
    5 7 이 입력되면 "홀수+홀수=짝수"가 출력된다.
    5 6 이 입력되면 "홀수+짝수=홀수"가 출력된다.
 */

import java.util.Scanner;

public class EvenOdd2 {

    public static String getEvenOdd(String num){
        if(Integer.parseInt(num) % 2 == 0)
            return "짝수";
        else
            return "홀수";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] num = new String[3];
        num[0] = sc.next();
        num[1] = sc.next();
        num[2] = String.valueOf(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));

        System.out.printf("%s+%s=%s", getEvenOdd(num[0]), getEvenOdd(num[1]), getEvenOdd(num[2]));
    }
}
