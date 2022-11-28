package Baekjoon_Study.Baekjoon_7W_DFS_BFS.BJON_1987_알파벳;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BJON_1987 {

    static int cnt = 0;
    static int max = -1;
    static int[][] map;
    static boolean[] visited = new boolean[26];

    public static void dfs(int x, int y) {

        if (x < 0 || y < 0 || x >= map.length || y >= map[0].length) {
            return;
        }
        if (!visited[map[x][y]]) {
            visited[map[x][y]] = true;

            dfs(x - 1, y); // 상
            dfs(x + 1, y); // 하
            dfs(x, y - 1); // 좌
            dfs(x, y + 1); // 우

            for (boolean t : visited) {
                cnt += t == true ? 1 : 0;
            }
            max = Math.max(max, cnt);
            cnt = 0;
            visited[map[x][y]] = false;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        map = new int[r][c];

        // 예제 입력 받기
        for (int i = 0; i < r; i++) {
            String row = sc.next();
            for (int j = 0; j < c; j++) {
                map[i][j] = row.charAt(j) - 'A';
            }
        }

        //예제 입력 확인
//        System.out.println(Arrays.deepToString(map));

        dfs(0,0);
        System.out.println(max);
    }
}
