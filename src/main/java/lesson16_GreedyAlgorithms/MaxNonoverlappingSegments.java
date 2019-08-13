package lesson16_GreedyAlgorithms;

/**
 * 0~N-1까지 숫자가 매겨진 N개의 세그먼트가 라인위에 있다.
 * 배열 A와 B에 각각의 위치가 있음.
 *
 * 각 세그먼트 i (0 <= i < N) 에 대해 세그먼트 i의 위치는 A[i]에서 B[i]임.
 * 세그먼트들은 끝을 기준으로 정렬됨
 * 즉, K가 0 <= K < N-1일 때 B [K] ≤ B [K + 1]임
 *
 * 목표는 오버래핑되지 않은 세그먼트의 최개 갯수 리턴.
 *
 *     A[0] = 1    B[0] = 5
 *     A[1] = 3    B[1] = 6
 *     A[2] = 7    B[2] = 8
 *     A[3] = 9    B[3] = 9
 *     A[4] = 9    B[4] = 10
 *
 * 처음부터 참고함.
 * int segCnt = 1; 왜 기본적으로 1을 깔고 가는지 이해가 안감.
 * A={1,3} / B={5,6} 인 경우 겹치지 않는 세그먼트가 없으니 0을 리턴해야 하는데
 *
 * @author 이주현
 * @since 2019.08.12
 */
public class MaxNonoverlappingSegments {
    public static void main(String[] args) {
        int[] A = {1,3,7,9,9};
        int[] B = {5,6,8,9,10};
        System.out.println(solution(A, B));
    }
    public static int solution(int[] A, int[] B) {
        if (A.length < 1) {
            return 0;
        }

        int segCnt = 1;
        int lastIdx = B[0];
        for (int i=1; i<A.length; i++) {
            if (A[i] > lastIdx) {
                segCnt++;
                lastIdx = B[i];
            }
        }
        return segCnt;
    }
}
