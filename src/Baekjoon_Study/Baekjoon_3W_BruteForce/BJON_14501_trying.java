package Baekjoon_Study.Baekjoon_3W_BruteForce;


import java.io.*;
import java.util.StringTokenizer;

class BJON_14501_trying {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int endDay = N;
        int hap = 0;
        for (int j = N-1; j >= 0; j--) {
            System.out.println("\tj:"+j+" day"+arr[j][0] +" endDay:"+endDay);
            if (j + arr[j][0] <= endDay) {
                endDay = j;
                hap += arr[j][1];
                System.out.println(arr[j][1]);
                continue;
            }

        }

        System.out.println(hap);
        bw.flush();
        bw.close();
        br.close();
    }

}