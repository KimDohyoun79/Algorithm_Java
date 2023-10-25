package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.R_달팽이는올라가고싶다;
//https://www.acmicpc.net/problem/2869

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2869 {

    //    #2 시간 초과 해결(=> 시간 제한 : 0.25초)
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken()); // A 변수
        int B = Integer.parseInt(st.nextToken()); // B 변수
        int V = Integer.parseInt(st.nextToken()); // 목표 높이

        V -= A; // 마지막 오름 미리 체크
        int re = 1; // 마지막 오름 미리 체크
        int gep = A - B; // A, B의 차

        // 마지막 오름을 빼고 gep으로 나누면 몇번 올라야하는지 구할 수 있다.
        // 그리고 나눈 나머지가 있을 경우 한번 더 올라야 하므로 +1을 한다.
        re += (V % gep == 0) ? (V / gep) : (V / gep + 1);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(re));
        bw.close();
    }

//     #1 시간 초과
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int A = Integer.parseInt(st.nextToken()); // A 변수
//        int gap = A - Integer.parseInt(st.nextToken()); // A와 B의 차
//        int V = Integer.parseInt(st.nextToken()); // 목표 높이
//
//        int count = 1; // 마지막 오름을 미리 저장
//        while(A < V){
//            A += gap; // A += A-B;를 연산해도 되지만 연산을 한번 줄임
//            count++;
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf(count));
//        bw.close();
//
//    }
}