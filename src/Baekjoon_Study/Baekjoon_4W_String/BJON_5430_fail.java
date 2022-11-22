package Baekjoon_Study.Baekjoon_4W_String;
//https://www.acmicpc.net/problem/5430

import java.io.*;
import java.util.*;


// try3 : 틀렸습니다..
/* 반례
1
D
1
[1]
=>[]

1
R
0
[]
=>error


 */
class BJON_5430_fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 케이스의 개수 T는 최대 100

        for (int i = 0; i < t; i++) {
            String p = sc.next();   // 수행할 함수 p(=RDD), 1보다 크거나 같고, 100,000보다 작거나 같다.
            int n = sc.nextInt();   // 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)
            String str = sc.next(); // 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)

            Deque<String> deque = new LinkedList<>();
            for (String s : str.substring(1, str.length() - 1).split(",")) {
                if (!s.equals(""))
                    deque.add(s);
            }

            boolean starOrEnd = true;
            for (int j = 0; j < p.length(); j++) {

                if (deque.size() == 0) {
                    System.out.println("error");
                    break;
                }
                if (p.charAt(j) == 'R') {
                    starOrEnd = !starOrEnd;
                } else {
                    if (starOrEnd)
                        deque.removeFirst();
                    else
                        deque.removeLast();
                }
            }


            StringBuilder result = new StringBuilder("[");
            int x = deque.size();
            if (starOrEnd) {
                for (int j = 0; j < x; j++) {
                    result.append(deque.removeFirst());
                    if(deque.size() !=0)
                        result.append(",");
                }
            } else {
                for (int j = 0; j < x; j++) {
                    result.append(deque.removeLast());
                    if(deque.size() !=0)
                        result.append(",");
                }
            }
            result.append("]");
            System.out.println(result);
        }
    }
}


// try2 : 시간초과..
//class Main_5430_fail {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt(); // 케이스의 개수 T는 최대 100
//
//        for (int i = 0; i < t; i++) {
//            String p = sc.next();   // 수행할 함수 p(=RDD), 1보다 크거나 같고, 100,000보다 작거나 같다.
//            int n = sc.nextInt();   // 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)
//            String[] num = sc.next().split("\\[|,|]"); // 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)
//
//
//            boolean starOrEnd = true;
//            int deleteCnt = 0;
//            for (int j = 0; j < p.length(); j++) {
//
//                if (p.charAt(j) == 'R') {
//                    starOrEnd = !starOrEnd;
//                } else{
//                    deleteCnt++;
//                    n--;
//                }
//
//            }
//
//
//            if (n <= 0) {
//                System.out.println("error");
//                continue;
//            }
//
//            String result = "[";
//            if (starOrEnd) {
//                for (int j = 1 + deleteCnt; j < num.length; j++) {
//                    result += num[j] + ",";
//                }
//            } else {
//                for (int j = num.length - 1 - deleteCnt; j >= 1 ; j--) {
//                    result += num[j] + ",";
//                }
//            }
//            result = result.replaceAll(",$", "]");
//            System.out.println(result);
//        }
//    }
//}


// try1 : 시간초과..
//class Main_5430 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            String p = sc.next();
//            int n = sc.nextInt();
//            String[] num = sc.next().split("\\[|,|]");
//
//            ArrayList<String> list = new ArrayList<>();
//            for (int j = 1; j <= n; j++) {  // split("\\[|,|]") 을 하면서 앞에 빈데이터가 들어가 있다. 그래서 인덱스 1부터 시작
//                list.add(num[j]);
//            }
//
//            boolean starOrEnd = true;
//            for (int j = 0; j < p.length(); j++) {
//
//                if (p.charAt(j) == 'R') {
//                    starOrEnd = !starOrEnd;
//                } else if (p.charAt(j) == 'D' && n > 0 && list.size() > 0) {
//                    n--;
//                    if (starOrEnd) {
//                        list.remove(0);
//                    } else
//                        list.remove(list.size() - 1);
//                }
//            }
//            if (n == 0) {
//                System.out.println("error");
//                continue;
//            }
//
//            String result = "[";
//            if (starOrEnd) {
//                for (int j = 0; j < list.size(); j++) {
//                    result += list.get(j) + ",";
//                }
//            } else {
//                for (int j = list.size() - 1; j >= 0; j--) {
//                    result += list.get(j) + ",";
//                }
//            }
//            result = result.replaceAll(",$", "]");
//            System.out.println(result);
//        }
//    }
//}