package AlgorithmStudy_Java.Baekjoon_3W_BruteForce;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class BJON_14225_trying {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 1 <= N <= 20
        int[] arr = new int[n]; // arr <= 100,000이하의 자연수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hap = 0;
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            hap +=arr[i];
        }

        //오름차순 정렬
        Arrays.sort(arr);




        int a= 10;
        System.out.println(a);
        bw.flush();
        bw.close();
        br.close();
    }

}