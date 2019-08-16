package lesson03_TimeComplexity;

import java.util.Arrays;

/**
 * N개의 다른 정수로 이루어진 배열 A.
 * 배열은 1~(N+1)의 범위안에 있다.
 *
 * 중간에 비어있는 숫자 리턴.
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * -> 4 리턴.
 *
 * N은 0~100,000
 * A에 반복되는 숫자 없음
 * A 요소의 숫자 범위는 (1~N+1)
 *
 * 6 mins, 50% -> 50% -> 100%
 *
 * @author 이주현
 * @since 2019.08.16
 */
public class PermMissingElemSecond {
    public static void main(String[] args) {
        int[] A = {2,3,1,5};
        //int[] A = {};       // 0아닌 1 리턴
        //int[] A = {1};       // 2 리턴
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i=0; i<A.length; i++) {
            if (i+1 != A[i]) {
                return i+1;
            }
        }
        return A.length+1;
    }
}
