package LikeLion_Back2_Class.week2;

public class HelloStar {
    /*

    *               0 1
    * *             1 2
    * * *           2 3
    * * * *         3 4

     */

    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            System.out.println("-----"); // -----이 4줄이 나올 것이다. 정말 나올까?

            // 1이 n개 나올 것이다
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("1");
            }
            System.out.println("");
        }
    }

    /*
      *
    * * *
  * * * * *
     */

}
