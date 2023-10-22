package Baekjoon_단계별로풀기.Bekjoon_07_2차원배열.행렬덧셈;
//https://www.acmicpc.net/problem/2738

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2738 {

    private static String[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bf.readLine().split(" ");

        if(nums[0].equals("0") || nums[1].equals("0")) {
            System.out.println(0);
            return;
        }
        arr = new String[Integer.parseInt(nums[0])][Integer.parseInt(nums[1])];

        for(int i = 0; i < Integer.parseInt(nums[0]); i++){
            String[] n = bf.readLine().split(" ");
            for(int j = 0; j < Integer.parseInt(nums[1]); j++){
                arr[i][j] = n[j];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < Integer.parseInt(nums[0]); i++){
            String[] n = bf.readLine().split(" ");
            for(int j = 0; j < Integer.parseInt(nums[1]); j++){
                bw.write(convert(arr[i][j], n[j]) + (j == Integer.parseInt(nums[1]) - 1 ? "": " "));
            }
            bw.newLine();
        }
        bw.close();

    }
    private static String convert(String a, String b){
        return String.valueOf(Integer.valueOf(a) + Integer.parseInt(b));
    }
}