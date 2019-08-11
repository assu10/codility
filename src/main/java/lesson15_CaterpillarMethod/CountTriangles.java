package lesson15_CaterpillarMethod;

import java.util.Arrays;

/**
 * N개의 정수로 이루어진 배열 A
 * 길이 A[P], A[Q], A[R]의 변이 있는 삼각형을 만들수 있으면 꼭지표 (P, Q, R)은 삼각형임.
 * 즉, 0 <= P < Q < R < N이면 (P,Q,R)은 삼각형
 *
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 *
 * 예를 들어 아래와 같은 배열 A
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 12
 *
 * 가능한 삼각형은 (0,2,4), (0,2,5), (0,4,5), (2,4,5) 총 4개이다.
 *
 * N개의 정수로 이루어진 배열 A가 주어졌을 때 삼각형의 갯수 리턴
 *
 * N은 0~1,000
 * A의 각 요소의 범위는 1~1,000,000,000
 *
 * 이해 못함.
 * 
 * @author 이주현
 * @since 2019.08.11
 */
public class CountTriangles {
    public static void main(String[] args) {
        int[] A = {10,2,5,1,8,12};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int triangeCnt = 0;
        Arrays.sort(A);
        for (int p=0; p<A.length; p++) {
            int r = p + 2;
            for (int q = p+1; q<A.length; q++) {
                while (r < A.length && A[r] < A[p] + A[q]) {
                    r++;
                }
                triangeCnt += r - q - 1;
            }
        }
        return triangeCnt;
    }
}
