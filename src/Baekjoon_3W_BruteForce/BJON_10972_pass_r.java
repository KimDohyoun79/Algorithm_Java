package Baekjoon_3W_BruteForce;

/*
1 3 2 4
=> 1 3 4 2

1 4 3 2  5
=> 1 4 3 5 2

1 4 3 5 2
=> 1 4   7 5 2
=> 1 5   7 4 2
=> 1 5   2 4 7



=> 풀릴 것 같으면서도 풀리지 않는 문제..
1. 뒤에서부터 앞쪽으로 이동하면서 n-1과 n을 비교 하며 n-1 < n인경우를 찾는다.
(찾은 인덱스를 기준으로 왼쪽 영역과 오른쪽 영역을 나눌 수 있다.)
ex)
12543  --> 12 543
123645987  --> 123645 987

2. (1)을 만족하면 뒤에서부터 n까지 앞쪽으로 이동하면서 n-1 다음으로 큰 수를 찾는다.

3. 크다면 자리를 바꾼다.

4. 오른쪽영역의 숫자를 오름차순으로 정렬해주면 된다.

입력 : 326154
--> 3261 54  (영역 나누기)
--> 3261 54  (크기 비교하기)
--> 3264 51  (자리 바꾸기)
--> 3264 15  (오름차순 정렬)

출력 : 326415
6
3 2 6 1 5 4
=>326415
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class BJON_10972_pass_r {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 뒤에서부터 탐색하면서 n-1보다 n가 더 큰 경우 찾음
        // 없을 경우 -1
        boolean ss = false;
        int n;
        for (n = arr.length - 1; 0 < n; n--) {
            if (arr[n - 1] < arr[n]) {
                break;
            }
        }
        if(n==0){
            System.out.println(-1);
            return;
        }

        // 뒤에서부터 탐색하면서 n-1 보다 다음으로 큰 수를 찾는다.
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = n; i < arr.length; i++) {
            if (arr[n - 1] < arr[i] && arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        //  n-1 과 n부터 검사하여 나온 다음으로 큰 수와 자리 바꾸기
        int tmp = arr[n-1];
        arr[n-1] = arr[minIndex];
        arr[minIndex] = tmp;

        //n부터 오름차순 정렬
        int[] arrTmp = Arrays.copyOfRange(arr, n, arr.length);
        Arrays.sort(arrTmp);

        // 앞부분 배열 출력
        for (int j = 0; j < n; j++) {
            bw.write(String.valueOf(arr[j]+" "));
        }
        // 뒷부분 배열 출력
        for (int k = 0; k < arrTmp.length; k++) {
            bw.write(String.valueOf(arrTmp[k]+" "));
        }

        bw.flush();
        bw.close();
        br.close();
    }

}