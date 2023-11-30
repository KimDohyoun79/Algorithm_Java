package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

    public static void MergeSort(int[] arr){
        int[] tmp = new int[arr.length];
        MergeSort(arr, tmp, 0, arr.length - 1);
    }

    // 분할
    private static void MergeSort(int[] arr, int[] tmp, int start, int end) {
        if(start < end){
            int mid = (start + end) / 2;
            MergeSort(arr, tmp, start, mid); // 앞쪽 부분
            MergeSort(arr, tmp, mid + 1, end); // 뒤쪽 부분
            merge(arr, tmp, start, mid, end);
        }
    }

    // 정복
    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for(int i = start; i <= end; i++){
            tmp[i] = arr[i];
        }
        int p1 = start;
        int p2 = mid + 1;
        int index = start;
        while(p1 <= mid && p2 <= end){
            if(tmp[p1] <= tmp[p2])
                arr[index] = tmp[p1++];
            else
                arr[index] = tmp[p2++];
            index++;
        }
        for(int i = 0; i <= mid - p1; i++){
            arr[index + i] = tmp[p1 + i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 9, 8, 7, 6};
        MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



