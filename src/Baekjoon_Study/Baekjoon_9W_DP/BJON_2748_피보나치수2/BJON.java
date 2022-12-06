package Baekjoon_Study.Baekjoon_9W_DP.BJON_2748_피보나치수2;

import java.util.Scanner;

class BJON {


    static long[] arr = new long[91];

    public static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        if(arr[n] != 0) return arr[n];
        return arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacci1(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {


        System.out.println(fibonacci(10)); // 55
        System.out.println(fibonacci(15)); // 610
        System.out.println(fibonacci(16)); // 987
        System.out.println(fibonacci(17)); // 1597
        System.out.println(fibonacci1(90)); // 1597

        System.out.println();
        System.out.println(fibonacci1(10)); // 55
        System.out.println(fibonacci1(15)); // 610
        System.out.println(fibonacci1(16)); // 987
        System.out.println(fibonacci1(17)); // 1597
        System.out.println(fibonacci1(90)); // 1597

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        System.out.println(fibonacci(n));
    }
}