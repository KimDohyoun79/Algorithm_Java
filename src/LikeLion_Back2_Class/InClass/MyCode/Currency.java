package LikeLion_Back2_Class.InClass.MyCode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt(); // 금액 저장 변수
        DecimalFormat moneyFormat = new DecimalFormat("###,###"); // 원화 표시

        int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 }; // 화폐 단위

        for(int i = 0; i < currency.length; i++){
            System.out.printf("%s원 : %d개\n", moneyFormat.format(currency[i]), money/currency[i]);
            money %= currency[i];
        }
    }
}
