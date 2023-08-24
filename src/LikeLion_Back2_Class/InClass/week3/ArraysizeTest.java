package LikeLion_Back2_Class.InClass.week3;

public class ArraysizeTest {

    public static void main(String[] args) {
        int[] arr = new int[500_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(arr[200]);
    }
}
