package lesson02_Arrays;

import java.util.Arrays;

public class CyclicRotationModify {
	public static void main(String[] args) {
		
		int[] A = {3,8,9,7,6};
		int K = 3;
		
		System.out.println(Arrays.toString(solution2(A, K)));
	}
	

	public static int[] solution2(int[] A, int K) {
		int[] rst = new int[A.length];
		
		for (int i=0; i<A.length;i++) {
			int idx = (i+K)%A.length;
			rst[idx] = A[i];
		}
		return rst;
	}
}
