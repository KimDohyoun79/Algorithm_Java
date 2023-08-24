package LikeLion_Back2_Class.InClass.week3.day1.part3.digit;

import java.util.Scanner;

public class Main {

    public static int getDigit(int num) {

        int cntDigit = 0;
        while (num > 0) {
            num = num / 10;
            cntDigit += 1;
        }
        return cntDigit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getDigit(num));
    }
}
