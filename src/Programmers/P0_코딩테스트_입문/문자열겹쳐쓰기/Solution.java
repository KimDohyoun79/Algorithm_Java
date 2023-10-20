package Programmers.P0_코딩테스트_입문.문자열겹쳐쓰기;
// https://school.programmers.co.kr/learn/courses/30/lessons/181943

public class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            if(i == s){
                for(int k = 0; k < overwrite_string.length(); k++){
                    answer += overwrite_string.charAt(k);
                    i++;
                }
            }
            if(i < my_string.length())
                answer += my_string.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution("He11oWor1d", "lloWorl", 2)); // "HelloWorld"
    }
}
