package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/1546

import java.util.Scanner;

public class BJON_1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double scores[] = new double[n];
        double max = -1;
        double hap = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
            if(max < scores[i])
                max = scores[i];
        }
        
        for (int i = 0; i < n; i++) {
                hap += scores[i] / max * 100;
        }

        System.out.println(hap/n);
    }
}