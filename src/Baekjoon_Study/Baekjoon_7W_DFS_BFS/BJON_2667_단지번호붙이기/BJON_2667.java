package Baekjoon_Study.Baekjoon_7W_DFS_BFS.BJON_2667_단지번호붙이기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BJON_2667 {

    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int cnt;

    public static void dfs(int x, int y) {

        visited[x][y] = true;
        
        //상
        if (x > 0 && map[x - 1][y] == 1 && !visited[x - 1][y]) {
            cnt++; // cnt변수 증가
            dfs(x - 1, y); // 윗쪽행으로 이동
        }

        //하
        if (x < map.length - 1 && map[x + 1][y] == 1 && !visited[x + 1][y]) {
            cnt++; // cnt변수 증가
            dfs(x + 1, y); // 이후 아랫쪽으로 이동
        }

        //좌
        if (y > 0 && map[x][y - 1] == 1 && !visited[x][y - 1]) {
            cnt++; // cnt변수 증가
            dfs(x, y - 1); // 이후 왼쪽으로 이동
        }

        //우
        if (y < map.length - 1 && map[x][y+1] == 1 && !visited[x][y+1]) {
            cnt++;
            dfs(x, y + 1);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        // 예제 입력 받기
        for (int i = 0; i < n; i++) { 
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = row.charAt(j) - '0';
                if (map[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    dfs(i, j);
                    arr.add(cnt);
                }
            }
        }

        // 총 단지수 출력
        System.out.println(arr.size());

        // 단지내 집의 수를 오르차순 정렬 후 출력
        Collections.sort(arr);
        for (int re: arr) {
            System.out.println(re);
        }

    }

}