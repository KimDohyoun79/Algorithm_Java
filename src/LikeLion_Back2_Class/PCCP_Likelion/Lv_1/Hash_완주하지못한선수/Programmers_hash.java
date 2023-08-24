package LikeLion_Back2_Class.PCCP_Likelion.Lv_1.Hash_완주하지못한선수;
//https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.HashMap;

public class Programmers_hash {
    public String solution1(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }

        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (map.containsKey(completion[i]))
                map.put(completion[i], map.get(completion[i]) - 1);

            if (map.get(completion[i]) == 0)
                map.remove(completion[i]);
        }

        for (String n : map.keySet())
            answer = n;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})); //leo
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"})); //vinko
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})); //mislav

    }
}


