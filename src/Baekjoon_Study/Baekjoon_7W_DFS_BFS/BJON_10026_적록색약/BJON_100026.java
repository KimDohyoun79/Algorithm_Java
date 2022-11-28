package Baekjoon_Study.Baekjoon_7W_DFS_BFS.BJON_10026_적록색약;

import java.util.Arrays;
import java.util.Scanner;

class BJON_100026 {

    static int[][] map;
    static int[][] visited;
    static int color;

    //적록색인 아닌 사림의 경우 확인
    public static void dfs(int x, int y) {

        if (x < 0 || y < 0 || x >= map.length || y >= map.length)
            return;

        if (visited[x][y] == 0 && map[x][y] == color) {
            if (map[x][y] == 3)
                visited[x][y] = -1;
            else
                visited[x][y] = 12;

            dfs(x - 1, y); // 상
            dfs(x + 1, y); // 하
            dfs(x, y - 1); // 좌
            dfs(x, y + 1); // 우
        }
    }

    //적록색인 사림의 경우 확인
    public static void dfs2(int x, int y) {

        if (x < 0 || y < 0 || x >= map.length || y >= map.length)
            return;

        if (visited[x][y] == 12) {
            visited[x][y] = -1;

            dfs2(x - 1, y); // 상
            dfs2(x + 1, y); // 하
            dfs2(x, y - 1); // 좌
            dfs2(x, y + 1); // 우
        }
    }

    public static int alphaToInt(char c) {
        if (c == 'R')
            return 1;
        else if (c == 'G')
            return 2;
        else
            return 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        map = new int[n][n];
        visited = new int[n][n];

        // 예제 입력 받기
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = alphaToInt(row.charAt(j));
            }
        }

        //예제 입력 확인
        //System.out.println(Arrays.deepToString(map));

        int[] rgb = new int[4];

        //적록색인 X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 0) {
                    color = map[i][j];
                    rgb[color]++;
                    dfs(i, j);
                }
            }
        }

        //적록색인 O
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 12) {
                    rgb[0]++;
                    dfs2(i, j);
                }
            }
        }

        System.out.print(rgb[1] + rgb[2] + rgb[3] + " ");
        System.out.println(rgb[0] + rgb[3]);
    }
}





// try 1 : 틀렸습니다.
//class BJON_100026 {
//
//    static int[][] map;
//    static int[][] visited;
//    static int color;
//
//    //적록색인 아닌 사림의 경우 확인
//    public static void dfs(int x, int y) {
//
//        if (x < 0 || y < 0 || x >= map.length || y >= map.length)
//            return;
//
//        int v = visited[x][y];
//        int m = map[x][y];
//        int c = color;
//        if (visited[x][y] == 0 && map[x][y] == color) {
//            if (visited[x][y] == 3)
//                visited[x][y] = -1;
//            else
//                visited[x][y] = 12;
//
//            dfs(x - 1, y); // 상
//            dfs(x + 1, y); // 하
//            dfs(x, y - 1); // 좌
//            dfs(x, y + 1); // 우
//        }
//    }
//
//    //적록색인 사림의 경우 확인
//    public static void dfs2(int x, int y) {
//
//        if (x < 0 || y < 0 || x >= map.length || y >= map.length)
//            return;
//
//        int v = visited[x][y];
//        int m = map[x][y];
//        int c = color;
//        if (visited[x][y] == 12) {
//            visited[x][y] = -1;
//
//            dfs2(x - 1, y); // 상
//            dfs2(x + 1, y); // 하
//            dfs2(x, y - 1); // 좌
//            dfs2(x, y + 1); // 우
//        }
//    }
//
//    public static int alphaToInt(char c) {
//        if (c == 'R')
//            return 1;
//        else if (c == 'G')
//            return 2;
//        else
//            return 3;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        map = new int[n][n];
//        visited = new int[n][n];
//
//        // 예제 입력 받기
//        for (int i = 0; i < n; i++) {
//            String row = sc.next();
//            for (int j = 0; j < n; j++) {
//                map[i][j] = alphaToInt(row.charAt(j));
//            }
//        }
//
//        //예제 입력 확인
//        //System.out.println(Arrays.deepToString(map));
//
//        int[] rgb = new int[4];
//
//
//        //적록색인 X
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (visited[i][j] == 0) {
//                    color = map[i][j];
//                    rgb[color]++;
//                    dfs(i, j);
//                }
//            }
//        }
//
//
//        //적록색인 O
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (visited[i][j] == 12) {
//                    rgb[0]++;
//                    dfs2(i, j);
//                }
//            }
//        }
//
//
//        System.out.print(rgb[1] + rgb[2] + rgb[3] + " ");
//        System.out.println(rgb[0] + rgb[2] + rgb[3]);
//    }
//}