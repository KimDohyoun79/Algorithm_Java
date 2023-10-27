package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.삼각형외우기;
//https://www.acmicpc.net/problem/10101

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJON_10101 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;

        for(int i = 0; i < 3; i++){
            int n = Integer.parseInt(bf.readLine());
            sum += n;
            hashSet.add(n);
        }
        String str = hashSet.size() == 1 ? "Equilateral" : // 세 각의 크기가 모두 같은 경우
                        sum != 180 ? "Error" : // 세 각 합 180이 아닌 경우
                                hashSet.size() == 2 ? "Isosceles" : "Scalene"; // 세 각 합이 180인 경우

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.close();
    }
}