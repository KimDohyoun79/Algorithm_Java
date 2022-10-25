package Back_Class.week3;

import java.util.Scanner;


// 값 3개 입력 받아서 짝수만 출력하기 1065번
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        // 짝수만 출력하기
        for (int i = 0; i < arr.length; i += 1) {
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
