package Back_Class.algorithm.sort;

import java.util.Arrays;

public class BubbleSort01 {
    public static int[] getSortedArray(int[] arr) {
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        // swap 0번과 1번 자리 바꾸기
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 4, 3, 11, 0};

        System.out.println(Arrays.toString(getSortedArray(arr)));
    }
}
