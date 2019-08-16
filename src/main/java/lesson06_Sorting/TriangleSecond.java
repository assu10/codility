package lesson06_Sorting;

/**
 * N개의 정수로 이루어진 배열 A.
 * 0 <= P < Q < R이고
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * 일 때 (P, Q, R)은 삼각형임.
 *
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 *
 * (0,2,4)는 삼각형.
 * 삼각형이 존재하면 1, 없으면 0 리턴.
 *
 *   A[0] = 10    A[1] = 50    A[2] = 5
 *   A[3] = 1
 *
 * 이건 0 리턴
 *
 * N은 0~100,000
 * 배열 A의 각 요소의 범위는 -2,147,483,648~2,147,483,647
 *
 * 23 mins, 68% -> 100%
 * O(N**3) -> O(N*log(N))
 *
 * @author 이주현
 * @since 2019.08.16
 */
public class TriangleSecond {
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

        for (int p=0; p<A.length; p++) {
            int q = p + 1;

            while(q < A.length) {
                int r = q + 1;
                while (r < A.length) {
                    if (A[p] < A[q]+A[r] && A[p]+A[q] > A[r] && A[r]+A[p] > A[q]) {
                        return 1;
                    }
                    r++;
                }
                q++;
            }
        }
        return 0;
    }
}
