package Baekjoon_Study.Baekjoon_7W_DFS_BFS.BJON_2206_벽부수고이동하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class BJON_2206 {

    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int cnt;
    static int chance;
    public static void bfs(int x, int y) {


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n][m];
        visited = new boolean[n][m];

        // 예제 입력 받기
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = row.charAt(j) - '0';
                if (map[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        System.out.println(Arrays.deepToString(map));



    }

}
