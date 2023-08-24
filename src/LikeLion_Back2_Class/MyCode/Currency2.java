package LikeLion_Back2_Class.MyCode;

import java.util.Scanner;

public class Currency2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt(); // 금액 저장 변수
        int refund = money;

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.printf("%d원권 : %d장\t나머지 : %d원\n", curr50000, refund/curr50000, refund%curr50000);
        refund %=curr50000;
        System.out.printf("%d원권 : %d장\t나머지 : %d원\n", curr10000, refund/curr10000, refund%curr10000);
        refund %=curr10000;
        System.out.printf("%d원권 : %d장\t나머지 : %d원\n", curr5000, refund/curr5000, refund%curr5000);
        refund %=curr5000;
        System.out.printf("%d원권 : %d장\t나머지 : %d원\n", curr1000, refund/curr1000, refund%curr1000);
        refund %=curr1000;
        System.out.printf("%d원권 : %d개\t나머지 : %d원\n", curr500, refund/curr500, refund%curr500);
        refund %=curr500;
        System.out.printf("%d원권 : %d개\t나머지 : %d원\n", curr100, refund/curr100, refund%curr100);
        refund %=curr100;
        System.out.printf("%d원권 : %d개\t나머지 : %d원\n", curr500, refund/curr50, refund%curr50);
        refund %=curr50;
        System.out.printf("%d원권 : %d개\t나머지 : %d원\n", curr100, refund/curr10, refund%curr10);
    }
}
