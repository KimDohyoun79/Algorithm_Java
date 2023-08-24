package LikeLion_Back2_Class.PCCP_Likelion.Lv_2.Sort_JadenCase문자열만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12951




//" " 공백문자가 여러개 올경우 split의 경우 오류가 발생합니다
// tokenizer의 true 로 사용하시는 걸 추천드립니다.
public class Programmers_permutation {

    public static boolean isAlpa(char c) {

        if ('a' <= c && c <= 'z')
            return true;
        else
            return false;
    }

    public static String solution(String s) {

        boolean first = true;
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                first = true;
                sb.append(s.charAt(i));
                continue;
            }

            if (isAlpa(s.charAt(i)) && first) {
                sb.append((char) (s.charAt(i) - 32));
            } else
                sb.append(s.charAt(i));
            first = false;
        }

        String answer = String.valueOf(sb);

        return answer;
    }

    public static void main(String[] args) {


        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
        System.out.println();

        System.out.println(solution("f"));
        String text200 = "f123456789012345678901234567890123 faA 7901234567890123456789 Ra 4567890123456789012345678901234 aaa 01234567891234567890123456789012345 BBB 13456789012345678901234567890123456789012345678901234567890";
        System.out.println("text200 size : " + text200.length());
        System.out.println(solution(text200));
        System.out.println();

        System.out.println(solution("aaa    BBB   cCC  "));

    }
}

// tyr2 : 틀렸습니다.
// 공백이 여러개 와도 여래개 만큼 출력해야 한다.
//import java.util.StringTokenizer;
//public class Programmers_permutation {
//
//    public static String changeFistWord(String s) {
//
//        StringBuilder sb = new StringBuilder("");
//
//        if ('a' <= s.charAt(0) && s.charAt(0) <= 'z')
//            sb.append((char) (s.charAt(0) - 32));
//        else
//            sb.append(s.charAt(0));
//
//        for (int i = 1; i < s.length(); i++) {
//            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
//                sb.append((char) (s.charAt(i) + 32));
//            else
//                sb.append(s.charAt(i));
//        }
//
//        return String.valueOf(sb);
//    }
//
//    public static String solution(String s) {
//
//        StringTokenizer st = new StringTokenizer(s);
//
//        StringBuilder sb = new StringBuilder();
//        while(st.hasMoreTokens()){
//            sb.append(changeFistWord(st.nextToken()));
//            if (st.hasMoreTokens())
//                sb.append(" ");
//        }
//
//        String answer = String.valueOf(sb);
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//
//        System.out.println(solution("3people unFollowed me"));
//        System.out.println(solution("for the last week"));
//        System.out.println();
//
//        System.out.println(solution("f"));
//        String text200 = "f123456789012345678901234567890123 faA 7901234567890123456789 Ra 4567890123456789012345678901234 aaa 01234567891234567890123456789012345 BBB 13456789012345678901234567890123456789012345678901234567890";
//        System.out.println("text200 size : " + text200.length());
//        System.out.println(solution(text200));
//        System.out.println();
//
//        System.out.println(solution("aaa    BBB   cCC  "));
//
//    }
//}


// try1: 런타임 에러
//" " 공백문자가 여러개 올경우 split의 경우 오류가 발생합니다
// tokenizer의 true 로 사용하시는 걸 추천드립니다.
//public class Programmers_permutation {
//
//    public static String changeFistWord(String s) {
//
//        StringBuilder sb = new StringBuilder("");
//
//        if ('a' <= s.charAt(0) && s.charAt(0) <= 'z')
//            sb.append((char) (s.charAt(0) - 32));
//        else
//            sb.append(s.charAt(0));
//
//        for (int i = 1; i < s.length(); i++) {
//            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
//                sb.append((char) (s.charAt(i) + 32));
//            else
//                sb.append(s.charAt(i));
//        }
//
//        return String.valueOf(sb);
//    }
//
//    public static String solution(String s) {
//
//
//        String[] ss = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < ss.length; i++) {
//            sb.append(changeFistWord(ss[i]));
//            if (i != ss.length - 1)
//                sb.append(" ");
//        }
//
//        String answer = String.valueOf(sb);
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//
//        System.out.println(solution("3people unFollowed me"));
//        System.out.println(solution("for the last week"));
//        System.out.println(solution("f"));
//
//        String text200 = "f123456789012345678901234567890123 faA 7901234567890123456789 Ra 4567890123456789012345678901234 aaa 01234567891234567890123456789012345 BBB 13456789012345678901234567890123456789012345678901234567890";
//        System.out.println("text200 size : " + text200.length());
//        System.out.println(solution(text200));
//    }
//}

