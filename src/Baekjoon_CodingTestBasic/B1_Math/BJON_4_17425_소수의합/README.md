# [Bronze I] 약수 - 1037

[문제 링크](https://www.acmicpc.net/problem/1037)

### 성능 요약

메모리: 17804 KB, 시간: 208 ms

### 분류

수학(math), 정수론(number_theory)

### 문제 설명

<p>양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.</p>

### 입력

 <p>첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.</p>

### 출력

 <p>첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.</p>


---

### Try 1 : 시간 초과
=> 결과 값은 나오지만 시간 초과
```java
class BJON_17425 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            long hap = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k * k <= j; k++) {

                    if (j%k == 0){
                        if(k != j/k)
                            hap += k + j/k;
                        else
                            hap += k;
                    }
                }
            }
            System.out.println(hap);
        }
    }
}
```

### Try 2 : 시간 초과
=> n이 소수인 경우 1+n만 하면 되므로 소수 판별 메소드를 만들어 시간 단축을 하려했지만 또 시간 초과..
```java
class BJON_17425 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            long hap = 0;
            for (int j = 1; j <= num; j++) {

                if (isPrime(j)) {
                    hap += 1 + j;
                } else {
                    for (int k = 1; k * k <= j; k++) {
                        if (j % k == 0) {
                            if (k != j / k)
                                hap += k + j / k;
                            else
                                hap += k;
                        }
                    }
                }

            }
            System.out.println(hap);
        }
    }

    public static boolean isPrime(int num) {

        if (num == 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
```



### Try more and more : 출력 문제
- 문제 설명 출력 부분에서 한줄에 하나씩 출력하라고 말한다
  <br>=> 예제를 복사해서 붙여넣기하여 컴파일하면 좀 엉키게 출력이 된다.
---  
< 입출력 EX > <br>
1 <br>
2 <br>
10 <br>
70<br>
10000`1`<br>
`4`<br>
`87`<br>
`4065`<br>
`82256014`

Process finished with exit code 0

---

- [기초 문제](https://code.plus/course/51)
- [참고 1](https://velog.io/@chesthyen/%EB%B0%B1%EC%A4%80-17425%EB%B2%88-%EC%95%BD%EC%88%98%EC%9D%98-%ED%95%A9-with-Java)
- [참고 2](https://castlehi.tistory.com/entry/P17425-%EC%95%BD%EC%88%98%EC%9D%98-%ED%95%A9) 
