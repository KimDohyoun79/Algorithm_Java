package baekjoon_1W_basic;
// https://www.acmicpc.net/problem/1966

import java.io.*;
import java.util.StringTokenizer;

class BJON_1966_tried {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] num = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if (num[M] <= num[j] && M != j) {
                    cnt++;
                    //System.out.println(j);
                }
            }
            System.out.println(cnt);
        }

    }

}