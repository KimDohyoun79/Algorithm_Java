package LikeLion_Back2_Class.InClass.week2;

public class PrintStar2 {
    /*
    0 1 2 3
    000*000  --> 3-0개만큼 0을 출력 별1개 시작은 3번부터
    00***00 -->  3-1개만큼 0을 출력 별 i*2 + 1개 시작은 2번부터
    0*****0 --> 3-2개만큼 0을 출력 별 i*2 + 1개 시작은 1번부터
    ******* --> 3-3개만큼 0을 출력 별 i*2 + 1개 시작은 0번부터
     */
    private String drawALine(int N, int i) {
        String line = "";
        for (int j = 0; j < N - i; j++) {
            line += "0";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            line += "*";
        }
        return line;
    }
    private String drawALine2(int N, int i) {
        String line = "";
        if (i > N) {
            i = 2 * N - i;
        }
        for (int j = 0; j < N - i; j++) {
            line += "0";
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            line += "*";
        }
        return line;
    }
    /*
    0 000*000  --> 3-0개만큼 0을 출력 별 i*2 + 1개 시작은 3번부터 (3, 0)
    1 00***00 -->  3-1개만큼 0을 출력 별 i*2 + 1개 시작은 2번부터 (3, 1)
    2 0*****0 --> 3-2개만큼 0을 출력 별 i*2 + 1개 시작은 1번부터 (3, 2)
    3 ******* --> 3-3개만큼 0을 출력 별 i*2 + 1개 시작은 0번부터 (3, 3)
    4 0*****0 --> 3-2개만큼 0을 출력 별 i*2 + 1개 시작은 1번부터 (3, 4) 2 (3에서 초과분만큼 뺌) 3 - (4 - 3) = 3 - 4 + 3
    5 00***00 --> 3-1개만큼 0을 출력 별 i*2 + 1개 시작은 2번부터 (3, 5) 1   = N - (i - N) = N - i + N = 2n - i
    6 000*000 --> 3-1개만큼 0을 출력 별 i*2 + 1개 시작은 2번부터 (3, 6) 0

    절반까지는 증가하지만
    이후엔 하나씩 뺀다
     */
    public void answer1() {
        int N = 7;
        for (int i = 0; i <= N; i++) {

            System.out.println(drawALine2(N / 2, i));
        }
    }
    public static void main(String[] args) {
        new PrintStar2().answer1();
    }
}
