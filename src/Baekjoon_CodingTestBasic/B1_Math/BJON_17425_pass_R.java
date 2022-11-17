package Baekjoon_CodingTestBasic.B1_Math;
// 문제 : 약수의 합
// 기초 문제 : https://code.plus/course/51
// 문제 링크 : https://www.acmicpc.net/problem/17425
// 참고 : https://velog.io/@chesthyen/%EB%B0%B1%EC%A4%80-17425%EB%B2%88-%EC%95%BD%EC%88%98%EC%9D%98-%ED%95%A9-with-Java
// 참고 : https://castlehi.tistory.com/entry/P17425-%EC%95%BD%EC%88%98%EC%9D%98-%ED%95%A9

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
- 출력 문제도 있다.. 문제 설명 출력 부분에서 한줄에 하나씩 출력하라고 말한다..
 => 예제를 복사해서 붙여넣기하여 컴파일하면 좀 엉키게 출력이 된다.
1
2
10
70
10000 1
4
87
4065

82256014

Process finished with exit code 0

 */
class BJON_17425_pass_R {

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


// try 2 : 시간 초과
// => n이 소수인 경우 1+n만 하면 되므로 소수 판별 메소드를 만들어 시간 단축을 하려했지만 또 시간 초과..
//class BJON_17425 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int num = sc.nextInt();
//            long hap = 0;
//            for (int j = 1; j <= num; j++) {
//
//                if (isPrime(j)) {
//                    hap += 1 + j;
//                } else {
//                    for (int k = 1; k * k <= j; k++) {
//                        if (j % k == 0) {
//                            if (k != j / k)
//                                hap += k + j / k;
//                            else
//                                hap += k;
//                        }
//                    }
//                }
//
//            }
//            System.out.println(hap);
//        }
//    }
//
//    public static boolean isPrime(int num) {
//
//        if (num == 1)
//            return false;
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0)
//                return false;
//        }
//
//        return true;
//    }
//}


// try 1 : 시간 초과
// => 결과 값은 나오지만 시간 초과
//class BJON_17425 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int num = sc.nextInt();
//            long hap = 0;
//            for (int j = 1; j <= num; j++) {
//                for (int k = 1; k * k <= j; k++) {
//
//                    if (j%k == 0){
//                        if(k != j/k)
//                            hap += k + j/k;
//                        else
//                            hap += k;
//                    }
//                }
//            }
//            System.out.println(hap);
//        }
//    }
//}