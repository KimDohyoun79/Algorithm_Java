package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.RR_세막대;
//https://www.acmicpc.net/problem/14215
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJON_14215 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        if(arr[0] == arr[1] && arr[1] == arr[2])
            bw.write((arr[0] * 3) + "");
        else if(arr[0] + arr[1] <= arr[2])
            bw.write((arr[0] + arr[1] + (arr[0] + arr[1] - 1)) + "");
        else
            bw.write((arr[0] + arr[1] + arr[2]) + "");

        bw.close();
    }
}