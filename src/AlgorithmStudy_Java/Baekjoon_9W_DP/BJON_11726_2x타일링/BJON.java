package AlgorithmStudy_Java.Baekjoon_9W_DP.BJON_11726_2x타일링;

import java.util.Scanner;

class BJON {

    static int[] dp;

    public static int cnt(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (dp[n] != 0) return dp[n];
        return dp[n] = (cnt(n - 1) + cnt(n - 2)) % 10007;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new int[n + 1];
        System.out.println(cnt(n));
    }
}