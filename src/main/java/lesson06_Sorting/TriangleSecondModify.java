package lesson06_Sorting;

import java.util.Arrays;

public class TriangleSecondModify {
    public static void main(String[] args) {
        int[] A = {10,2,5,1,8,20};      // (0,2,4) 1 리턴
//        int[] A = {};    // 0 리턴
//        int[] A = {10,50,5,1};  // 0 리턴

        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i=2; i<A.length; i++) {
            if (isTriange(A[i-2], A[i-1], A[i])) {
                System.out.println(A[i-2]+"__"+A[i-1]+"__"+ A[i]);
                return 1;
            }
        }
        return 0;
    }

    private static boolean isTriange(long p, long q, long r) {
        if (p + q <= r) {
            return false;
        }
        if (q + r <= p) {
            return false;
        }
        if (r + p <= q) {
            return false;
        }
        return true;
    }

}
