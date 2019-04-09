import java.util.Arrays;
import java.util.Random;

public class RandomTestCase {
	public static void main(String[] args) {
		// N개로 이루어진 배열
		// 그 안 숫자의 범위는 -10~10
//		int N = 100000;
//		int min = -2147483648;
//		int max = 2147483647;
		
		int N = 10;
		int min = -10;
		int max = 10;
		
		int[] A = new int[N];
		
		Random rand = new Random();
		
		// min~max까지의 랜덤 함수 (중복 있음)
		for (int i=0; i<N; i++) {
			A[i] = rand.nextInt(max-min+1) + min;
		}
		
		
		// min~max까지의 랜덤 함수 (중복 제거)
		for (int i=0; i<N; i++) {
			A[i] = rand.nextInt(max-min+1) + min;
			for (int j=0; j<i; j++) {
				if (A[i] == A[j]) {
					i--;
				}
			}
		}
		
		//// -2147483648 ~ 2147483647의 랜점 정수
		// 중복 있음
		for (int i=0; i<N; i++) {
			A[i] = rand.nextInt();
		}
		
		// 중복 없음
		for (int i=0; i<N; i++) {
			A[i] = rand.nextInt();
			for (int j=0; j<i; j++) {
				if (A[i] == A[j]) {
					i--;
				}
			}
		}
		
		System.out.println(Arrays.toString(A));
		
	}
}
