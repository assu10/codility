package lesson08_Leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeaderModify {
    public static void main(String[] args) {
        int[] A = {4,3,4,4,4,2};    // returns 2
         //int[] A = {1};   // 0
        // int[] A = {1,1};   // 1
        // int[] A = {1,1,1};   // 2
        // int[] A = {1,1,1,1};   // 3
        // int[] A = {4,3,3,4,4,3};   // 0
        // int[] A = {4,3,3,4,4,3,3};   // 0
        // int[] A = {4,3,3,4,4,3,3};   // 0
        // int[] A = {4,3,3,4,4,3,3,3};   // 2
        //int[] A = {4,3,3,4,3,3,4,4};   // 0
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }

        // 배열 전체 갯수 중 반+1 이상이 되어야 equi leader 존재
        int conditionCnt = (A.length/2)+1;
        int leaderValue = 0;    // 기준이 되는 leader 값
        int leaderCnt = 0;    // 기준이 되는 leader 갯수

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
                leaderCnt = entry.getValue();
            }
        }

        int equiLeaderCnt = 0;
        int RightLeaderCnt = leaderCnt;  // 리더 숫자의 갯수를 넣어줌
        int LeftLeaderCnt = 0;


        for (int i=A.length-1; i>=0; i--) {
            if (A[i] == leaderValue) {
                LeftLeaderCnt++;
                RightLeaderCnt--;
            }

            if (LeftLeaderCnt > i/2 && RightLeaderCnt > ((A.length-i)/2)) {
                equiLeaderCnt++;
            }
        }

        return equiLeaderCnt;
    }
}
