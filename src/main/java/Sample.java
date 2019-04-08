import java.util.*;

/**
 * 연속되지 않은 숫자의 배열 중 포함되지 않은 가장 작은 양의 정수 리턴
 * 모두 연속되어 있으면 그 다음값 리턴
 *
 *  A = [1, 3, 6, 4, 1, 2] -> 5
 *  A = [1, 2, 3] -> 4
 *  A = [−1, −3] -> 1
 *
 *  90min, 100%
 */
public class Sample {
	public static void main(String[] args) {
		int[] A = {1,2,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		// 올림차순으로 정렬
		Arrays.sort(A);
		
		int max = A[A.length-1];
		
		// 최대값이 음수면 1 리턴
		if (max < 0) {
			return 1;
		}
		
		// 1부터 최대값까지의 boolean 값을 담을 배열
		boolean[] checked = new boolean[max];
		
		// 해당 위치의 값이 있으면 true 표기
		for (int i=1; i<A.length+1; i++) {
			if (A[i-1] > 0) {
				checked[A[i-1]-1] = true;
			}
		}
		
		// 모든 값이 연속되는지 판단
		boolean allContinue = false;
		
		for (int i=0; i<checked.length; i++) {
			if (!checked[i]) {
				return i+1;
			}
			allContinue = true;
		}
		
		if (allContinue) {
			return max + 1;
		}
		
		return 1;
	}
}
	
	// 배열안의 요소는 1부터 시작(+1)하므로 잃어버린 요소(+1), 총 +2
//	boolean[] checked = new boolean[A.length+2];
//
//		for (int i=0; i<A.length; i++) {
//		checked[A[i]] = true;
//		}
//
//		for (int i=1; i<checked.length; i++) {
//		if (!checked[i]) {
//		return i;
//		}
//		}
