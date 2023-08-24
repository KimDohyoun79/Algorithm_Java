package LikeLion_Back2_Class.week2;

public class PrintStar {
    /*
    0 1 2 3
    000*000  --> 3-0개만큼 0을 출력 별1개 시작은 3번부터
    00***00 -->  3-1개만큼 0을 출력 별 i*2 + 1개 시작은 2번부터
    0*****0 --> 3-2개만큼 0을 출력 별 i*2 + 1개 시작은 1번부터
    ******* --> 3-3개만큼 0을 출력 별 i*2 + 1개 시작은 0번부터
     */
    public void answer1() {
        int N = 3;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.printf("0");
            }
            // 여기 오답으로 무한으로 돈다
            for (int j = 0; j < 2 * i + 1; i++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    public void answer2() {
        int N = 3;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.printf("0");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    public void answer3() {
        int N = 3;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.printf("0");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

    }
}
