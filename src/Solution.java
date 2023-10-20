import java.util.Scanner;

class Solution {
    public static void removeDuplicates(int[] nums) {

        for (int i = 0; i < nums.length; i= ++i *2) {
            System.out.println("i : " + i + " nums[i] : " + nums[i]);
        }
    }

    public static void main(String[] args) {

       removeDuplicates(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}


