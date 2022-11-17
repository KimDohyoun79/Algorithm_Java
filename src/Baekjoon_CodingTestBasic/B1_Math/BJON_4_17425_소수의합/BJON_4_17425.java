package Baekjoon_CodingTestBasic.B1_Math.BJON_4_17425_소수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BJON_4_17425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        long[] arr = new long[1_000_001];
        Arrays.fill(arr, 1);
        arr[0] = 0;

        for (int i = 2; i < 1_000_001; i++) {
            for (int j = 1; j * i < 1_000_001; j++) {
                arr[i * j] += i;
            }
            arr[i] = arr[i - 1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            sb.append(arr[Integer.parseInt(br.readLine())]+"\n");
        }
        System.out.println(sb);
    }
}
