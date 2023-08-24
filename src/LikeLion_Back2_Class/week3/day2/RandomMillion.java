package LikeLion_Back2_Class.week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RandomMillion {
    public void ex01(int maxNum) {

        TreeSet<Integer> set1 = new TreeSet<>();

        for (int i = 1; i < maxNum; i++) {
            int rndNum = (int)(Math.random() * maxNum);
            set1.add(rndNum);
            if (i % 100_000 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(set1.size());
    }
    public void ex02(int maxNum) {

        Integer[] memo = new Integer[maxNum];

        for (int i = 1; i < maxNum; i++) {
            int rndNum = (int)(Math.random() * maxNum);
            memo[i] = rndNum;
            if (i % 100_000 == 0) {
                System.out.println(i);
            }
        }
        Set<Integer> set1 = new HashSet<>(Arrays.asList(memo));
        System.out.println(set1.size());
    }
    public static void main(String[] args) {
        RandomMillion randomMillion = new RandomMillion();
        randomMillion.ex02(1_000_000);
    }
}
