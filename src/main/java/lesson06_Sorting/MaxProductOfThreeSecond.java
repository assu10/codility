package lesson06_Sorting;

import java.util.Arrays;

/**
 * N개의 정수로 이루어진 비어있지 않은 배열 A.
 * (P, Q, R)은 A[P]*A[Q]*A[R]과 같음
 * (0 <= P < Q < R < N)
 *
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 *
 * -> 60 리턴 (2*5*6)
 *
 * 목표는 세 숫자의 가장 큰 값을 찾는 것
 *
 * N은 3~100,000
 * 배열 A의 각 요소의 범위는 -1,000~1,000
 *
 * 10 mins, 100%
 *
 * @author 이주현
 * @since 2019.08.14
 */
public class MaxProductOfThreeSecond {
    public static void main(String[] args) {
        int[] A = {-3,1,2,-2,5,6};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int rtnOne = A[0]*A[1]*A[A.length-1];
        int rtnTwo = A[A.length-1]*A[A.length-2]*A[A.length-3];
        return Math.max(rtnOne, rtnTwo);
    }
}
