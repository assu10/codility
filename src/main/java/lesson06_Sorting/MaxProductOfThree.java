package lesson06_Sorting;

import java.util.Arrays;

/**
 * N개의 숫자로 이루어진 배열 A
 * (P, Q, R)은 A[P] * A[Q] * A[R]이다.
 * (0 <= P < Q < R < N)
 *
 * 목표는 최대값을 찾는 것
 *
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 *
 * -> (2,4,5) = 60 리턴
 *
 * N은 3~100,000
 * A 배열 각 요소는 -1,000 ~ 1,000
 *
 * 50mins, 66% -> 100% (현재 아래 로직도 100%임)
 * 모두 음수인 경우를 놓침.
 *
 * @author 이주현
 * @since 2019.08.09
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        //int[] A = {-3,1,2,-2,5,6};  // returns 60
        //int[] A = {1,3,2,-10,-30,-20};  // returns 1800
        //int[] A = {-5,-6,-4,-7,-10};  // returns -120
        int[] A = {4, 7, 3, 2, 1, -3, -5};  // returns 105
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // 올림차순 정렬
        Arrays.sort(A);
       // System.out.println(Arrays.toString(A));

        int minusTwoProduct = A[0] * A[1];
        int plusTwoProduct = A[A.length-1] * A[A.length-2];

        // 모두 음수인 경우
        if (A[A.length-1] < 0) {
            return plusTwoProduct * A[A.length-3];
        } else {
            // 제일 작은 수의 두 수가 음수인 경우
            if (A[0] < 0 && A[1] < 0) {
                int minusProduct = minusTwoProduct * A[A.length-1];
                int plusProduct = plusTwoProduct * A[A.length-3];

                return minusProduct > plusProduct ? minusProduct : plusProduct;
            } else {
                return plusTwoProduct * A[A.length-3];
            }
        }
    }
}
