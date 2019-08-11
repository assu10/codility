package lesson16_GreedyAlgorithms;

import java.util.stream.IntStream;

/**
 *
 * 0~N-1까지 숫자가 매겨진 N개의 밧줄
 * 밧줄들의 길이는 배열 A에 담김
 * 각각의 I는 0 <= i < N, 밧줄 i의 길이는 A[i]
 *
 * 두 개의 밧줄 i, i+1은 근접해있다.
 * 두 개의 근접한 밧줄은 서로 묶을 수 있다.
 * 묶인 밧줄의 길이는 두 개의 밧줄의 길이의 합
 * 새로운 밧줄은 다시 묶일 수 있음
 *
 * 정수 K가 주어졌을 때 목표는 길이가 K보다 같거나 큰
 * 로프의 갯수의 최대값.
 *
 * 예를 들어 K가 4이고 A가 아래인 경우
 *     A[0] = 1
 *     A[1] = 2
 *     A[2] = 3
 *     A[3] = 4
 *     A[4] = 1
 *     A[5] = 1
 *     A[6] = 3
 *
 * 밧줄 1, 2를 묶어서 길이 5
 * 밧줄 4, 5,6을 묶어서 길이 5
 *
 * 길이가 K=4와 같거나 크게 묶을 수 있는 밧줄의 갯수는 3개
 * 4개의 밧줄을 묶을 수 없음
 *
 * 인접한 밧줄끼리 묶다가 K값 이상이 되면 멈춤.
 * 최종적으로 나눠진 밧줄의 갯수 리턴
 *
 * 16min, 12%
 * 문제를 잘못 이해했었음
 *
 * @author 이주현
 * @since 2019.08.11
 */
public class TieRopes {
    public static void main(String[] args) {
        int K = 4;
        int[] A = {1,2,3,4,1,1,3};

        System.out.println(solution(K, A));
    }

    public static int solution(int K, int[] A) {
        // write your code in Java SE 8
        int maxCnt = 0;

        if (IntStream.of(A).sum() < K) {
            return 0;
        }

        for (int i=0; i<A.length; i++) {
            int j = i+1;
            int sum = A[i];
            while (j < A.length && sum <= K) {
                sum += A[j];
                j++;
            }
            maxCnt++;
            i = j-1;
           // maxCnt = Math.max(maxCnt, cnt);
        }
        //System.out.println(maxCnt);
        return maxCnt;
    }
}
