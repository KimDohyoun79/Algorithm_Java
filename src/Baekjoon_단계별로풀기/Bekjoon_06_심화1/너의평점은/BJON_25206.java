package Baekjoon_단계별로풀기.Bekjoon_06_심화1.너의평점은;
//https://www.acmicpc.net/problem/25206

import java.io.*;
import java.util.HashMap;

public class BJON_25206 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("P", 0.0);
        map.put("F", 0.0);


        double result = 0;
        double n = 0;
        for(int i = 0; i < 20; i++){
            String[] str = br.readLine().split(" ");
            if(str[2].equals("P")){
                continue;
            }
            result += (Double.valueOf(str[1]) * map.get(str[2]));
            n += Double.valueOf(str[1]);
        }
        System.out.printf("%.6f", result/n);

    }
}