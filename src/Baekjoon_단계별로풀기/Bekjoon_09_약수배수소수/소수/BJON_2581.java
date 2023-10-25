package Baekjoon_단계별로풀기.Bekjoon_09_약수배수소수.소수;
//https://www.acmicpc.net/problem/2581

import java.io.*;

public class BJON_2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        int sum = 0;
        int min = 0;
        boolean minCheck = true;

        for(int i = m; i <= n; i++){
            if(decimal(i)){
                sum += i;
                if(minCheck){
                    min = i;
                    minCheck = false;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sum == 0)
            bw.write("-1");
        else
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
        bw.close();
    }

    private static boolean decimal(int num){
        if(num == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}