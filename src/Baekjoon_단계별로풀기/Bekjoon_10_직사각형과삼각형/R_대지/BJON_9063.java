package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.R_대지;
//https://www.acmicpc.net/problem/9063
import java.io.*;
import java.util.StringTokenizer;

public class BJON_9063 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());

        int minX = 10001, maxX = -10001;
        int minY = 10001, maxY = -10001;
        if(n == 1)
            bw.write("0");
        else{
            int x, y;
            for(int i = 0; i < n; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                minX = minX > x ? x : minX;
                minY = minY > y ? y : minY;
                maxX = maxX < x ? x : maxX;
                maxY = maxY < y ? y : maxY;
            }
            bw.write("" + ((maxX - minX) * (maxY - minY)));
        }

        bw.close();
    }

    private static boolean decimal(int num){
        if(num == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}