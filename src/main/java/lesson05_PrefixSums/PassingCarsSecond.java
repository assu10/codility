package lesson05_PrefixSums;

import java.util.stream.IntStream;

/**
 * N개의 정수로 이루어진 비어있지 않은 배열 A
 * A의 연속된 요소는 길 위의 연속된 차를 의미
 *
 * A은 1과 0으로만 구성되어 있음
 * 0 : 동쪽으로 가는 차
 * 1 : 서쪽으로 가는 차
 *
 * 목표는 지나가는 차 세는 것
 *
 * P가 동쪽으로 가고, Q가 서쪽으로 갈 때 0 <= P < Q < N일 때 한 쌍의 자동차 (P, Q)가 지나가고 있다고 함.
 *
 *   A[0] = 0
 *   A[1] = 1
 *   A[2] = 0
 *   A[3] = 1
 *   A[4] = 1
 *
 * (0,1), (0,3), (0,4), (2,3), (2,4) -> 5 리턴
 *
 * 1,000,000,000가 넘으면 -1 리턴
 *
 * N은 1~100,000
 *
 * 18mins, 50%
 *
 * 로직은 맞으나 퍼포먼스 이슈. (O(N ** 2))
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class PassingCarsSecond {
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int passingCarsCnt = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] == 0) {
                passingCarsCnt += IntStream.of(A).sum();
            } else {
                A[i] = 0;
            }
        }
        return passingCarsCnt;
    }
}
