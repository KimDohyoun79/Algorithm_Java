package Baekjoon_CodingTestBasic.B1_Math;
// 문제 : 약수의 합
// 기초 문제 : https://code.plus/course/51
// 문제 링크 : https://www.acmicpc.net/problem/17425
// 참고 :

import java.util.Scanner;

class BJON_17425 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        //int t = 1;


        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            long hap = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k * k <= j; k++) {

                    if (j%k == 0){
                        if(k != j/k)
                            hap += k + j/k;
                        else
                            hap += k;
                    }
                }
            }
            System.out.println(hap);
        }
    }
}