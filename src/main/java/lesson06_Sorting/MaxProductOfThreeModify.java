package lesson06_Sorting;

import java.util.Arrays;

public class MaxProductOfThreeModify {
    public static void main(String[] args) {
        //int[] A = {-5,-6,-4,-7,-10};  // returns -120
        int[] A = {4, 7, 3, 2, 1, -3, -5};  // returns 105
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        // 모두 음수인 경우
        if (A[A.length-1] < 0) {
            return A[A.length-1] * A[A.length-2] * A[A.length-3];
        }

        // 큰 수 중 음수가 하나라도 있는 경우
        if (A[A.length-2] < 0 || A[A.length-3] < 0) {
            return A[A.length-1] * A[0] * A[1];
        }

        int rtn1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int rtn2 = A[A.length-1] * A[0] * A[1];

        return rtn1 > rtn2 ? rtn1 : rtn2;
    }
}