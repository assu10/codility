package lesson08_Leader;

import java.util.HashMap;
import java.util.Map;

/**
 * N개의 정수로 이루어진 비어있지 않은 배열 A
 * 배열의 리더는 A 요소의 반 보다 많은 값.
 * equi 리더는 0 <= S < N-1인 인덱스 S,
 * 두 개의 시퀀스 A[0], A[1], ..., A[S] 와 A[S + 1], A[S + 2], ..., A[N − 1] 는 같은 값의 리더를 가짐
 *
 *     A[0] = 4
 *     A[1] = 3
 *     A[2] = 4
 *     A[3] = 4
 *     A[4] = 4
 *     A[5] = 2
 *
 * 여기는 2개의 equi 리더가 있음
 * 0 : (4), (3,4,4,4,2) 리더는 4
 * 2 : (4,3,4), (4,4,2) 리더는 4
 *
 * 목표는 equi 리더의 갯수 리턴
 *
 * 위에선 2 리턴
 *
 * N은 1~100,000
 * A 의 각 요소는 -1,000,000,000~1,000,000,000
 *
 * 111 mins, 33%
 * equiLeaser의 갯수를 세는 부분만 수정하면 될 듯
 *
 * 가장 많은 수를 구한다.
 * @author 이주현
 * @since 2019.08.11
 */
public class EquiLeader {
    public static void main(String[] args) {
        //int[] A = {4,3,4,4,4,2};    // returns 2
        // int[] A = {1};   // 0
        // int[] A = {1,1};   // 1
        // int[] A = {1,1,1};   // 2
        // int[] A = {1,1,1,1};   // 3
        // int[] A = {4,3,3,4,4,3};   // 0
        // int[] A = {4,3,3,4,4,3,3};   // 0
        // int[] A = {4,3,3,4,4,3,3};   // 0
        // int[] A = {4,3,3,4,4,3,3,3};   // 2
        int[] A = {4,3,3,4,3,3,4,4};   // 0
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }

        // 배열 전체 갯수 중 반+1 이상이 되어야 equi leader 존재
        int conditionCnt = (A.length/2)+1;
        int leaderValue = 0;    // 기준이 되는 leader 값
        int equiLeaderCnt = 0;

        // 요소 갯수 세기
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int n : A) {
            if (hMap.containsKey(n)) {
                hMap.put(n, hMap.get(n)+1);
            } else {
                hMap.put(n, 1);
            }
        }

        // 기준이 되는 leader값 추출
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (conditionCnt == 0 || entry.getValue().compareTo(conditionCnt) >= 0) {
                leaderValue = entry.getKey();
            }
        }

        int[] tmpA = new int[A.length];
        for (int i=0; i<A.length; i++) {
            if (A[i] == leaderValue) {
                tmpA[i] = 1;
            } else {
                tmpA[i] = 0;
            }
        }
        // equiLeader 갯수
        for (int i=1; i<tmpA.length+1; i++) {
            if (tmpA[i-1] == 1) {
                int hOne = 0;
                int hTwo = 0;

                for (int j=0; j<i; j++) {
                    hOne += tmpA[j];
                }
                for (int k=i; k<tmpA.length; k++) {
                    hTwo += tmpA[k];
                }

                //int conOne = (int) Math.ceil((double)i/2);
                //int conTwo = (int) Math.ceil((double)(tmpA.length-i)/2);

                int conOne = (i/2)+1;
                int conTwo = ((tmpA.length-i)/2)+1;

                if (hOne > conOne && hTwo >= conTwo) {
                    equiLeaderCnt++;
                }
            }
        }
        // System.out.println(leaderValue);    // 4
        //System.out.println(hMap);   // {2=1, 3=1, 4=4}

        return equiLeaderCnt;
    }
}
