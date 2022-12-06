package Baekjoon_Study.Baekjoon_9W_DP.BJON_1463_1로만들기;

import java.util.Scanner;

class BJON {

    public static int cnt(int n) {

        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {

            if (i % 6 == 0)
                dp[i] = Math.min(dp[i / 2] + 1, dp[i / 3] + 1);
            else if (i % 2 == 0)
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1); // 10
            else if (i % 3 == 0)
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);

            if ((i - 1) % 2 == 0 || (i - 1) % 3 == 0) {
                if (dp[i] != 0) // 10
                    dp[i] = Math.min(dp[i], dp[i - 1] + 1);
                else    // 5, 7
                    dp[i] = dp[i - 1] + 1;
            }

        }
        return dp[n];

    }


    public static void main(String[] args) {

        System.out.println(cnt(1)); // 0
        System.out.println(cnt(2)); // 1
        System.out.println(cnt(3)); // 1
        System.out.println(cnt(4)); // 2
        System.out.println(cnt(5)); // 3
        System.out.println();
        System.out.println(cnt(6)); // 2
        System.out.println(cnt(7)); // 3
        System.out.println(cnt(8)); // 3
        System.out.println(cnt(9)); // 2
        System.out.println(cnt(10)); // 3
        System.out.println();
        System.out.println(cnt(11)); // 4
        System.out.println(cnt(12)); // 3
        System.out.println(cnt(15)); // 4
        System.out.println(cnt(16)); // 4
        System.out.println(cnt(17)); // 5
        System.out.println(cnt(30)); // 4
        System.out.println();
        System.out.println(cnt(36)); // 4
        System.out.println(cnt(18)); // 3
        System.out.println(cnt(10384)); // 12

        System.out.println(cnt(96));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(cnt(n));
    }
}