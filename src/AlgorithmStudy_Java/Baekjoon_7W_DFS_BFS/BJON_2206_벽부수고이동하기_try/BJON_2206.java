package AlgorithmStudy_Java.Baekjoon_7W_DFS_BFS.BJON_2206_벽부수고이동하기_try;

import java.util.*;
/*
3 6
010001
010110
000110
=> 13

visited 이차원 변수에서 문제..
큐 뒤쪽 bfs 탐색에서 앞에서 먼저 방문했지만 결과값은 못낸 곳을 true로 처리가 되어 있다.
이 부분이 문제가 되어 코드가 돌지 않고 있다.
=> [2][1]까지 방문하고 [1][1]을 방문려고 하고 이미 앞의 탐색에서 방문을하여.. 방문으로 처리됨
=> 방문지도를 여러개 ??
 */

// 메모리 초과..
class BJON_2206 {

    public static int px[] = {-1, 1, 0, 0};
    public static int py[] = {0, 0, -1, 1};

    static int chance;
    static int cnt = 0;
    static int minlen = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[][][] visited;

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y, 1, 1});
        visited[0][x][y] = true;

        while (!queue.isEmpty()) {

            int[] xy = queue.poll();
            x = xy[0];
            y = xy[1];
            cnt = xy[2];
            chance = xy[3];

            if (x == map.length - 1 && y == map[0].length - 1) {
                if (cnt < minlen)
                    minlen = cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + px[i];
                int ny = y + py[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length)
                    continue;

                if (map[nx][ny] == 1 && chance == 0)
                    continue;

                int visitedIndex = 0;
                if(chance == 0)
                    visitedIndex = 1;
                if ((map[nx][ny] == 0 || chance == 1) && visited[visitedIndex][nx][ny] == false) {
                    visited[visitedIndex][x][y] = true;
                    queue.offer(new int[]{nx, ny, cnt + 1, map[nx][ny] == chance ? 0 : 1});
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n][m];
        visited = new boolean[2][n][m];

        // 예제 입력 받기
//        for (int i = 0; i < n; i++) {
//            String row = sc.next();
//            for (int j = 0; j < m; j++) {
//                map[i][j] = row.charAt(j) - '0';
//            }
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = 0;

            }
        }
        System.out.println(1);
        bfs(0, 0);
        if (minlen < Integer.MAX_VALUE)
            System.out.println(minlen);
        else
            System.out.println(-1);
    }
}


// try2 : 24% 에서 틀렸습니다..
/*

9 9
010001000
010101010
010101010
010101010
010101010
010101010
010101010
010101011
000100010
=> ANSWER : 33


6 6
010001
010101
010101
010101
010110
000110
=> Answer : 21


1 1
0
=> Answer : 1


3 6
010001
010110
000110
=> 13

visited 이차원 변수에서 문제..
큐 뒤쪽 bfs 탐색에서 앞에서 먼저 방문했지만 결과값은 못낸 곳을 true로 처리가 되어 있다.
이 부분이 문제가 되어 코드가 돌지 않고 있다.
=> [2][1]까지 방문하고 [1][1]을 방문려고 하고 이미 앞의 탐색에서 방문을하여.. 방문으로 처리됨
=> 방문지도를 여러개 ??
 */
//class BJON_2206 {
//
//    public static int px[] = {-1, 1, 0, 0};
//    public static int py[] = {0, 0, -1, 1};
//
//    static int chance;
//    static int cnt = 0;
//    static int minlen = Integer.MAX_VALUE;
//    static int[][] map;
//    static boolean[][] visited;
//
//    public static void bfs(int x, int y) {
//        Queue<int[]> queue = new LinkedList<>();
//
//        queue.offer(new int[]{x, y, 1, 1});
//        visited[x][y] = true;
//
//        while (!queue.isEmpty()) {
//
//            int[] xy = queue.poll();
//            x = xy[0];
//            y = xy[1];
//            cnt = xy[2];
//            chance = xy[3];
//
//            if (x == map.length - 1 && y == map[0].length - 1) {
//                if (cnt < minlen)
//                    minlen = cnt;
//            }
//
//            for (int i = 0; i < 4; i++) {
//                int nx = x + px[i];
//                int ny = y + py[i];
//
//                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length)
//                    continue;
//
//                if (map[nx][ny] == 1 && chance == 0)
//                    continue;
//
//                if ((map[nx][ny] == 0 || chance == 1) && visited[nx][ny] == false) {
//                    visited[x][y] = true;
//                    queue.offer(new int[]{nx, ny, cnt + 1, map[nx][ny] == chance ? 0 : 1});
//                }
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        map = new int[n][m];
//        visited = new boolean[n][m];
//
//        // 예제 입력 받기
//        for (int i = 0; i < n; i++) {
//            String row = sc.next();
//            for (int j = 0; j < m; j++) {
//                map[i][j] = row.charAt(j) - '0';
//            }
//        }
//
//        bfs(0, 0);
//        if (minlen < Integer.MAX_VALUE)
//            System.out.println(minlen);
//        else
//            System.out.println(-1);
//    }
//}


// 미완성 코드지만 디버깅 중 StackOverflowError 에러가 났다.
// dfs를 많이 사용해서 그런 것 같다. bfs를 사용하자
//class BJON_2206 {
//
//    static boolean chance = true;
//    static int cnt = 0;
//    static int max = -1;
//    static int[][] map;
//    static boolean[][] visited;
//
//    public static void dfs(int x, int y) {
//        if (x < 0 || y < 0 || x >= map.length || y >= map[0].length) {
//            return;
//        }
//
//
//        if ((!visited[x][y] && map[x][y] == 0) || chance) {
//            if (map[x][y] == 1)
//                chance = false;
//            visited[x][y] = true;
//
//            cnt++;
//            System.out.println(cnt);
//            dfs(x - 1, y); // 상
//            dfs(x + 1, y); // 하
//            dfs(x, y - 1); // 좌
//            dfs(x, y + 1); // 우
//
//            chance = true;
//            if(map[x][y] !=1)
//                visited[x][y] = false;
//
//            if (x == map.length - 1 && y == map[0].length) {
//                max = Math.max(max, cnt);
//                cnt = 0;
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        map = new int[n][m];
//        visited = new boolean[n][m];
//
//        // 예제 입력 받기
//        for (int i = 0; i < n; i++) {
//            String row = sc.next();
//            for (int j = 0; j < m; j++) {
//                map[i][j] = row.charAt(j) - '0';
//                if (map[i][j] == 1) {
//                    visited[i][j] = true;
//                }
//            }
//        }
//
//        dfs(0, 0);
//        System.out.println(max);
//    }
//
//}