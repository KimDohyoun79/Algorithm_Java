
이분 탐색 
1. 보통 출력값 데이터를 기준으로 이분탐색
2. 정렬이 필요하지 않는 경우가 있다. (1 ~ max)
3. `초기화` L, R, P 값을 기본적인 변수로 사용
4. `if` L, R, P 값을 초기화를 위한 조건이 필요 and 비교할 데이터 선정 <br>
(= Uppper, Lowwer Bound를 찾는 과정)
5. `if` L or R 값을 초기화
6. `L > R` 이면 반복문 종료 및 결과 확인
```java
    L = 1; R = max;
    while(L <= R){
    P = (L + R) / 2;    // 3.초기화
    
        
    if(조건){ // 4.Uppper, Lowwer Bound를 찾는 과정
        cnt;
        result;    
    }
        
    if(조건)  // 5.L or R 초기화
        L = P + 1;
    else
        R = P - 1;
    }
    
    return result;

        
```

---


#### 정렬을 사용하면 시간 초과가 된다. <br>
=> 과자를 정렬하는 것이 아니다.<br>
=> 이분탐색에서 정렬 할 데이터는 pivot값 기준으로 사용할 데이터가 정렬되어 있으면 된다.

<br>

#### 나누어 줄 수 없을때 예외처리 ! 
- pivot 값 계산에서 <런타임 에러 by zero> 발생했다.<br>
=> 초기 left 값을 0을 초기화하면 0까지 pivot을 계산하는데 사용된다.<br>
=> 이분탐색에서  pivot값 기준으로 사용할 데이터에 0이 없도록 하자<br>

<br>

#### 모든 조카에게 나눠줄 수 없으면 0 / 런타임 에러 by zero

---
### 반례

4 2 <br>
10 11 <br>
=> 5

5 3 <br>
2 5 10 <br>
=> 2

6 6 <br>
5 5 5 4 5 7 <br>
=> 4

4 10 <br>
9 10 120 40 55 12 40 50 60 10 <br>
=> 55

10  3<br>
1 1 1<br>
=> 0

---

[참고 1](https://congsoony.tistory.com/201) <br>
[참고 2](https://velog.io/@kmh9250/%EB%B0%B1%EC%A4%8016401-%EA%B3%BC%EC%9E%90-%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0)
