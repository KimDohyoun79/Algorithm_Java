package Baekjoon_5W_Review;


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class test {

    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);

        Queue<Integer> arr = new LinkedList<>();

        arr.add(3);
        arr.add(2);
        arr.add(1);

        System.out.println(arr);

        System.out.println(arr.peek());

        arr.poll();
        System.out.println(arr);

    }

}