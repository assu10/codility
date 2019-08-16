package lesson08_Leader;

import java.util.HashMap;

/**
 * N개의 연속된 정수로 이루어진 배열 A.
 * A의 도미네이터는 A요소의 절반보다 많은 값.
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 *
 * 여기선 3 이 도미네이터.
 *
 * 목표는 도미네이터의 인덱스 중 하나 리턴.
 * 위에선 0,2,4,6,7 중 하나 리턴하면 됨.
 *
 * N은 0~100,000
 * A의 각 요소의 범위는 -2,147,483,648~2,147,483,647
 *
 * 11 mins, 100%
 *
 * @author 이주현
 * @since 2019.08.16
 */
public class DominatorSecond {
    public static void main(String[] args) {
        //int[] A = {3,4,3,2,3,-1,3,3};       // 0,2,4,6,7 중 하나
        int[] A = {};       // 0,2,4,6,7 중 하나

        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int halfCnt = A.length/2;

        for (int i=0; i<A.length; i++) {
            if (hMap.containsKey(A[i])) {
                hMap.put(A[i], hMap.get(A[i])+1);
                if (hMap.get(A[i]) > halfCnt) {
                    return i;
                }
            } else {
                hMap.put(A[i], 1);
            }
        }

        return -1;
    }
}
