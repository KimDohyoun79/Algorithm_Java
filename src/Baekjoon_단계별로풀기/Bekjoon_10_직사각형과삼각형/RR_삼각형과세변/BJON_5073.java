package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.RR_삼각형과세변;
//https://www.acmicpc.net/problem/5073

import java.io.*;
import java.util.StringTokenizer;

public class BJON_5073 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] arr = new int[3];

            // 데이터 저장
            for(int i = 0; i < 3; i++)
                arr[i] = Integer.valueOf(st.nextToken());

            // 0이면 종료
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) // 입력값이 모두 0이면 종료
                break;
            String str = "";
            if (arr[0] == arr[1] && arr[1] == arr[2]) // 세 변의 길이가 같을 경우
                str = "Equilateral";
            else{
                int max = Math.max(arr[0] , Math.max(arr[1], arr[2]));
                if(max >= arr[0] + arr[1] + arr[2] - max)  // 삼각형 조건에 만족하지 않는 경우
                    str = "Invalid";
                else if((arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2])) // 두변이 같을 경우
                    str = "Isosceles";
                else    //  세 변의 길이가 모두 다른 경우
                    str = "Scalene";
            }
            bw.write(str + "\n");
        }
        bw.close();
    }
}