package LikeLion_Back2_Class.InClass.sort;

import java.util.Arrays;

public class BubbleSort02 {
    public static int[] getSortedArray(int[] arr) {
        System.out.printf("%d %d \n", arr[0], arr[1]); // arr 6까지
        System.out.printf("%d %d \n", arr[0], arr[2]);
        System.out.printf("%d %d \n", arr[0], arr[3]);
        System.out.printf("%d %d \n", arr[0], arr[4]);
        System.out.printf("%d %d \n", arr[0], arr[5]);
        System.out.printf("%d %d \n", arr[0], arr[6]);

//        // swap 0번과 1번 자리 바꾸기
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 4, 3, 11, 0};

        System.out.println(Arrays.toString(getSortedArray(arr)));
    }
}
