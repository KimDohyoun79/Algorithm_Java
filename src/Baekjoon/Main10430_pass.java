package Baekjoon;
//https://code.plus/course/51
//https://www.acmicpc.net/problem/1920
//https://st-lab.tistory.com/19
import java.util.Scanner;

class Main10430_pass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }

}