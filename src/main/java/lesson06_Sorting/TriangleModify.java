package lesson06_Sorting;

import java.util.Arrays;

/**
 * 입력받은 숫자들을 변의 길이라고 가정했을 때, 삼각형을 그릴 수 있는지를 리턴
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 *
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 *
 * 세 꼭짓점 (P, Q, R) = (0,2,4)는 삼각형. -> 1리턴
 *
 *   A[0] = 10    A[1] = 50    A[2] = 5
 *   A[3] = 1
 *
 * 삼각형 못 그림 -> 0 리턴
 *
 *
 * 60min, 0% -> 93% (overflow)
 *
 * 아래를 통과못하는데 최대값으로 다 셋팅하고 해도 RUN에선 통과.. 뭔지 모르겠다. ㅠㅠ
 *
 * extreme_arith_overflow1
 * overflow test, 3 MAXINTs
 */
public class TriangleModify {
	public static void main(String[] args) {
		int[] A = {2147483647,2147483646,2147483645};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
		
		// 요소가 2개 이하의 배열일 경우 0 리턴
		if (A.length <= 2) {
			return 0;
		} else {
			for (int i=A.length-3; i>=0; i--) {
				if (isTriangle(A[i], A[i+1], A[i+2])) {
					return 1;
				}
			}
			return 0;
		}
	}
	
	public static boolean isTriangle(int P, int Q, int R) {
		int first = -Q + R;
		int second = Q - R;
		int third = Q + R;
		if (P > first && P > second && P < third) {
			return true;
		} else {
			return false;
		}
	}
	
}
