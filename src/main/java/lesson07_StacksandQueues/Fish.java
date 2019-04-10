package lesson07_StacksandQueues;


import java.util.HashMap;

/**
 * 상류,하류로 흐르는 물고기
 * A배열은 물고기의 크기
 * B배열은 물고기의 방향 (0은 왼쪽으로, 1은 오른쪽으로)
 * 서로 같은 방향은 만나지 않고, 다른 방향인 경우 크기가 더 큰 물고기가 작은 물고기 잡아먹음
 * 최종적으로 남는 물고기의 개수 리턴
 *
 * 75min, 37%
 * 스택을 써야함.
 *
 * @since 2019.04.10
 */
public class Fish {
	public static void main(String[] args) {
		//int[] A = {4,3,2,1,5};
		//int[] B = {0,1,0,0,0};
		int[] A = {4};
		int[] B = {1};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<A.length; i++) {
			map.put(A[i], B[i]);
		}
		
		for (int i=0; i<A.length-1; i++) {
			// 첫 요소가 아래로 흘러가면 만나지 않음
			if (B[i] == 0) {
				continue;
			}
			
			// 흐름이 같지 않은 경우만
			if (B[i] != B[i+1]) {
				if (A[i] > A[i+1]) {
					map.remove(A[i+1]);
					A[i+1] = A[i];
					B[i+1] = B[i];
				} else {
					map.remove(A[i]);
				}
			}
		}
		return map.size();
	}
	
}
