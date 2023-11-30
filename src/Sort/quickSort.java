package Sort;

import java.util.Arrays;

public class quickSort {

    public static void QuickSort(int[] arr){
        QuickSort(arr, 0, arr.length - 1);
    }

    // 분할
    public static void QuickSort(int[] arr, int start, int end){
        int pivot = partition(arr, start, end);
        if(start < pivot - 1)
            QuickSort(arr, start, pivot - 1);
        if(pivot < end)
            QuickSort(arr, pivot, end);
    }

    // 정복
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];

        while(start <= end){
            while(arr[start] < pivot) start++;
            while(pivot < arr[end]) end--;
            if(start <= end) {
                swap(arr, start++, end--);
            }
        }
        return start;
    }

    public static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }



    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 9, 8, 7, 6};
        QuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



