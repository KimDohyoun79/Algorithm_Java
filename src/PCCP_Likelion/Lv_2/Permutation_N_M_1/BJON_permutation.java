package PCCP_Likelion.Lv_2.Permutation_N_M_1;
//https://www.acmicpc.net/problem/15649

import java.util.Scanner;

public class BJON_permutation {

    public static void recursion(int m){
        if(m == 0)
            return;

        recursion(m-1);
        System.out.println(m);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            recursion(i);
        }

    }
}


