package lesson15_CaterpillarMethod;

import java.util.HashSet;

/**
 * N개의 양의 정수로 이루어진 비어있지 않은 배열 A와 정수 M.
 * 배열 A안의 모든 정수는 M보다 같거나 작음
 *
 * 0 <= P <= Q < N 인 경우 (P, Q)는 A의 slice라고 부름
 *
 * slice는 A[P], A]P+1)...,A[Q]로 이루어져 있음.
 * A의 고유 조각은 유니크한 숫자로만 구성되어있는 조각임.
 *
 * 예를 들어 M=6이고 배열 A가 아래와 같은 경우
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 5
 *     A[3] = 5
 *     A[4] = 2
 *
 * 여기는 정확하게 9개의 고유 조각.
 * (0,0) / (0,1) / (0,2) / (1,1) / (1,2)
 * (2,2) / (3,3), (3,4), (4,4)
 *
 * 가능한 최대 고유 조각의 수를 리턴할 것
 *
 * 만일, 고유 조각의 수가 1,000,000,000보다 크면 1,000,000,000 리턴
 *
 * N은 1~100,000
 * M은 0~100,000
 * A의 각 요소의 범위는 0~M
 *
 * 52 mins, 70%
 * 로직은 이슈없으나 퍼포먼스 이슈 (O(N * (N + M)) -> O(N)으로 개선)
 *
 * @author 이주현
 * @since 2019.08.12
 */
public class CountDistinctSlices {
    public static void main(String[] args) {
        int M = 6;
        int[] A = {3,4,5,5,2};  // 9
//        int M = 3;
//        int[] A = {0,0,1,2};  // 7
        System.out.println(solution(M, A));
    }

    public static int solution(int M, int[] A) {
        if (M == 0) {
            return A.length;
        }
        // 유니크 여부 판단할 hashset. 정렬 필요없이 검색만.
        HashSet<Integer> hSet = new HashSet<>();
        int distinctSliceCnt = 0;

        for (int i=0; i<A.length; i++) {
            hSet.add(A[i]);
            distinctSliceCnt++;
            for (int j=i+1; j<A.length; j++) {
                if (hSet.contains(A[j])) {
                    break;
                } else {
                    hSet.add(A[j]);
                }
                distinctSliceCnt++;
            }
            hSet.clear();
        }
        return distinctSliceCnt > 1000000000 ? 1000000000 : distinctSliceCnt;
    }
}
