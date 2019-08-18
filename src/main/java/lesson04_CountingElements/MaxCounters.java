package lesson04_CountingElements;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * 처음에 0으로 셋팅된 N개의 카운터가 있음.
 * 그들을 2개의 연산 가능
 * - increase(x) : 카운터 X에 1을 더함
 * - max counter - 모든 카운터들을 모든 카운터의 최대값으로 설정
 *
 * M 정수의 배열 A가 있을 때 이 배열은 아래 연속적인 연산 가능
 * - A[K]=X, 1 <= X <= N이면 연산K는 increase(x)
 * - A[K]=N+1이면 연산 K는 max counter.
 *
 *
 * N=5이고 아래 배열 A인 경우
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 *
 * 각 연속된 연산을 하고 난 값은
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 *
 * 위는 [3, 2, 2, 4, 2] 리턴.
 *
 * N과 M은 1~100,000
 * 배열 A 요소의 범위는 1~N+1
 *
 * 목표는 모든 연산을 하고 난 후의 배열 리턴.
 *
 * 79 mins, 100%
 *
 * @author 이주현
 * @since 2019.08.18
 */
public class MaxCounters {
    public static void main(String[] args) {
        int N = 5;
        //int[] A = {3,4,4,6,1,4,4};      // 3,2,2,4,2
        //int[] A = {2,4,4,6,1,2,6,2};        // 3,4,3,3,3
        //int[] A = {1,2};        // 1,1,0,0,0
        int[] A = {7,7};        // 0,0,0,0,0

        System.out.println(solution(N, A));
    }
    public static int[] solution(int N, int[] A) {
        // N보다 큰 배열 요소 추출 ([2,4,4,6,1,2,6,2] -> [2,4,4],[1,2],[2] 에서 [2,4,4],[1,2])
        // 배열 요소의 갯수-1 (마지막은 increase 적용해야 하므로) 개의 배열에서 각각 제일 많이 반복되는 숫자의 갯수 더해줌
        // 더해준 수를 기본 갯수로 셋팅 (0이 아닌)
        // 이 후 마지막 배열에서 increase 수행

        HashMap<Integer, Integer> hMap = new HashMap<>();
        int maxNum = 0;
        int subMaxNum = 0;
        int lastMaxCounterIdx = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] > N) {
                // max counter
                maxNum += subMaxNum;

                subMaxNum = 0;
                hMap.clear();
                lastMaxCounterIdx = i;
            } else {
                if (hMap.containsKey(A[i])) {
                    hMap.put(A[i], hMap.get(A[i])+1);
                } else {
                    hMap.put(A[i], 1);
                }
                subMaxNum = Math.max(subMaxNum, hMap.get(A[i]));
            }
        }

        // max counter를 계산하여 해당값으로 값을 채운 배열 생성
        int[] rtnArr = new int[N];
        Arrays.fill(rtnArr, maxNum);

        // max counter 하고 남은 부분에서 increase 수행
        if (lastMaxCounterIdx == 0) {
            lastMaxCounterIdx = -1;
        }
        for (int i=lastMaxCounterIdx+1; i<A.length; i++) {
            rtnArr[A[i]-1]++;
        }

        return rtnArr;
    }
}
