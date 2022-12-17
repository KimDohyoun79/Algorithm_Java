import java.util.Arrays;
import java.util.Scanner;

class test {

    public static int solution(int hp) {
        int answer = 0;

        answer += hp /5;
        hp %=5;

        answer += hp/3;
        hp %=3;

        return answer+hp;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hp = sc.nextInt();

        System.out.println(solution(hp));
    }
}