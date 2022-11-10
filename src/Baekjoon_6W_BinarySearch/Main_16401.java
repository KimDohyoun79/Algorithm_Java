package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/1920

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main_16401 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nephewN = sc.nextInt();
        int snackN = sc.nextInt();
        int[] snackArr = new int[snackN];

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < snackN; i++) {
            list.add(sc.nextInt());
        }

        if (nephewN > snackN) {
            int maxMid = Collections.max(list) / (nephewN - snackN + 1);
            int min = Collections.min(list);
            if (min < maxMid) {
                System.out.println(min);
            } else {
                System.out.println(maxMid);
            }

        } else {
            for (int i = 0; i < nephewN - 1; i++) {
                list.remove(Collections.max(list));
            }
            System.out.println(Collections.max(list));
        }
    }
}