package lesson09_MaximumSliceProblem;

import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * N개의 정수로 이루어진 비어있지 않은 배열 A
 * 0 <= P <= Q < N 과 같을 때 (P,Q)를 A의 조각이라고 칭함.
 * (P,Q)의 sum은 A[P] + A[P+1] + ... + A[Q]
 *
 * 목표는 A의 최대 slice sum 구할 것
 *
 * A[0] = 3  A[1] = 2  A[2] = -6
 * A[3] = 4  A[4] = 0
 *
 * 위에선 5 리턴
 * (0,1) = 3+2 = 5
 *
 * N은 1~1,000,000
 * A의 각 요소의 범위는 -1,000,000~1,000,000
 * 결과값의 범위는 -2,147,483,648~2,147,483,647
 *
 * 모두 음수인 경우는 가장 큰 값 리턴
 * 모두 양수인 경우는 모든 값 합하여 리턴
 * 음수와 양수가 섞인 경우는 음수를 기준으로 slice한 값을 더하여 가장 큰 값 리턴
 *
 * 54mins, 69%
 * {3,-2, 3}인 경우 실패
 * 음수와 양수가 섞인 경우 음수를 기준으로 slice 한다는 가정 오류
 *
 * @author 이주현
 * @since 2019.08.11
 */
public class MaxSliceSum {
    public static void main(String[] args) {
//        int[] A = {3,2,-6,4,0};     // returns 5
        // int[] A = {5}        // 5
        // int[] A = {1,1,1}        // 3
        // int[] A = {3,2,0,4,-6}        // 9
//        int[] A = {-1,-2,-3,-4,-5};     // -1
//        int[] A = {-3,-4,-1,-2,-5};     // 0 (모두 음수인 경우)
//        int[] A = {-3,3,0, 4,-1};        // 7
//        int[] A = {-1,3,1,-2,4,0,5};      // 9 (음수와 양수 섞인 경우)이 아닌 11 리턴 (4-2+9)
//        int[] A = {1,2,3,4,5,0,6};        // 21 (모두 양수인 경우)
        int[] A = {3,-2,3};        // 3이 아니라 4 리턴 (3-2+3)
        System.out.println(solution(A));

    }
    public static int solution(int[] A) {
        // 배열의 요소 확인 (모두 음수 or 모두 양수 or 음수/양수 혼합 인지 여부)
        boolean isAllMinus = true;
        boolean isAllPlus = true;

        for (int n : A) {
            if (n > 0) {
                isAllMinus = false;
            }
            if (n < 0) {
                isAllPlus = false;
            }
        }

        int nMax = Integer.MIN_VALUE;

        // 모두 음수인 경우 -> 가장 큰 값 리턴
        if (isAllMinus) {
            for (int n : A) {
                nMax = Math.max(n, nMax);
            }
            return nMax;
        }

        // 모두 양수인 경우 -> 모든 값 합하여 리턴
        if (isAllPlus) {
            return IntStream.of(A).sum();
        }

        // 음수와 양수가 섞인 경우 -> 음수를 기준으로 slice한 후 각각의 합 중 최대값 리턴
        TreeSet<Integer> tSet = new TreeSet<>();
        int sliceSum = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] >= 0) {
                sliceSum += A[i];
            } else {
                tSet.add(sliceSum);
                sliceSum = 0;
            }
            if (i == A.length-1) {
                tSet.add(sliceSum);
            }
        }
        //System.out.println(tSet);
        return tSet.last();
    }
}
