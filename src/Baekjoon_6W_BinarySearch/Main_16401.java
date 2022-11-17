package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/1920
// 참고 : https://congsoony.tistory.com/201
// 참고2 : https://velog.io/@kmh9250/%EB%B0%B1%EC%A4%8016401-%EA%B3%BC%EC%9E%90-%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
4 2
10 11
=> 5

5 3
2 5 10
=> 2

6 6
5 5 5 4 5 7
=> 4

4 10
9 10 120 40 55 12 40 50 60 10
=> 55
 */
class Main_16401 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nephewM = sc.nextInt();
        int snackN = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < snackN; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        System.out.println(binarySearch01(0, list.getLast(), nephewM, list));

    }

    public static int binarySearch01(int left, int right, int M, LinkedList<Integer> list) {

        int result = 0;
        while (left <= right) {
            int pivot = (left + right) / 2;
            int cnt = 0;


            for (int i = (list.size() - 1); i >= 0; i--) {
                cnt += list.get(i) / pivot;
                if(cnt >= M)
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