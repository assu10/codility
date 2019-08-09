package lesson08_Leader;

import java.util.HashMap;
import java.util.Map;

/**
 * N개의 정수로 이루어진 배열 A
 * A의 우세값은 A 요소의 절반 초과에서 발생하는 값.
 *
 * 목표는 우세값의 인덱스 중 하나 리턴
 * 우세값이 없으면 -1 리턴
 *
 * N은 0~100,000
 * A 각 요소의 범위는 -2147483648~2147483647
 *
 * 31min, 100%
 *
 * @author 이주현
 * @since 2019.08.09
 */
public class Dominator {
    public static void main(String[] args) {
        int[] A = {3,4,3,2,3,-1,3,3};       // 0,2,4,6,7 중 하나 리턴
        //int[] A = {};       // -1
        //int[] A = {2,1,1,3};       // -1
        //int[] A = {1,2,1};       // 0
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> numCnt = new HashMap<Integer, Integer>();
        for (int i=0; i<A.length; i++) {
            if (numCnt.containsKey(A[i])) {
                numCnt.put(A[i], numCnt.get(A[i])+1);
            } else {
                numCnt.put(A[i], 1);
            }
        }

        //System.out.println(numCnt);     // {-1=1, 2=1, 3=5, 4=1}
        //System.out.println(A.length);
        int half = A.length/2;
        int dominatorNum = -1;
        System.out.println(half);

        for (Map.Entry<Integer, Integer> entry : numCnt.entrySet()) {
            if (entry.getValue() > half) {
                dominatorNum = entry.getKey();
                break;
            }
        }

        for (int i=0; i<A.length; i++) {
            if (A[i] == dominatorNum) {
                return i;
            }
        }
//        /System.out.println(dominatorNum);
        return -1;
    }
}
