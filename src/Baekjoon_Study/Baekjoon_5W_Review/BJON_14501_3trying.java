package Baekjoon_Study.Baekjoon_5W_Review;
//https://www.acmicpc.net/problem/14501

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class BJON_14501_3trying {
    private static int[] T;
    private static int[] P;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        T = new int[N];
        P = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {

            result[i] = ss(i, N);

        }
        System.out.println(Arrays.toString(result));



    }

    public static int ss(int start, int lastDay) {
        int f = 0;
        for (int i = start; i < lastDay; i++) {

            if (i + T[i] <= lastDay) {
                f += P[i];
                i += T[i] - 1;
            }
        }
        return f;
    }

}


// 코드 전제가 잘못됐다. => 앞에서 뒤에서 무식하게 날짜 계산하며 수익 계산하는 방식
//class Main_14501_3trying {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc= new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] T = new int[N];
//        int[] P = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            T[i] = sc.nextInt();
//            P[i] = sc.nextInt();
//        }
//
//        int f = 0;
//        int e = 0;
//        int lastDay = N;
//        for (int i = 0; i < N; i++) {
//
//            if(i+T[i] <= N){
//                f += P[i];
//                i += T[i]-1;
//            }
//        }
//
//        lastDay = N;
//        int[] test = new int[10];
//        for (int i = N-1; i >= 0; i--) {
//
//            if(i+T[i] <= lastDay){
//                e += P[i];
//                lastDay = i;
//                test[i]= P[i];
//            }
//        }
//        System.out.println(f>e?f:e);
//    }
//}