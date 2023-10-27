package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/10813
// 공 바꾸기
import java.util.Scanner;

public class BJON_10813 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = N; i > 0; i--) {
            arr[i - 1] = i;
        }
//        System.out.println(Arrays.toString(arr));

        while (M-- > 0) {
            int i = sc.nextInt()-1, j = sc.nextInt()-1;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i != N - 1 ? " " : ""));
        }
    }
}