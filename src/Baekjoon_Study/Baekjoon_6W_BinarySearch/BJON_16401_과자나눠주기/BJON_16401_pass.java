package Baekjoon_Study.Baekjoon_6W_BinarySearch.BJON_16401_과자나눠주기;



import java.util.Scanner;


class BJON_16401_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nephewM = sc.nextInt();
        int snackN = sc.nextInt();

        int[] arr = new int[snackN];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < snackN; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(binarySearch01(1, max, nephewM, arr));

    }

    public static int binarySearch01(int left, int right, int M, int[] arr) {

        int result = 0;
        while (left <= right) {
            int pivot = (left + right) / 2;
            int cnt = 0;


            for (int i = arr.length - 1; i >= 0; i--) {
                cnt += arr[i] / pivot;
                if (cnt >= M)
                    break;
            }

            if (cnt >= M) {
                result = pivot;
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return result;
    }
}