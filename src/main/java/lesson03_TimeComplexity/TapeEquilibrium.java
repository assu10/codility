package lesson03_TimeComplexity;


/**
 * 두 구간으로 쪼갰을 때 구간별 합의 차가 가장 적은 곳의 차 리턴
 *
 * 49min, 92%->100%
 *
 * 퍼포먼스 100%이나, only one element on one of the sides
 * 중첩 for문이 없어야 함
 *
 * @since 2019.04.07
 */
public class TapeEquilibrium {
	public static void main(String[] args) {
		int[] A = {3,1,2,4,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int aLen = A.length;
		
		// 각 파트의 합을 담을 배열 생성
		int[] firstPart = new int[aLen-1];
		int[] secondPart = new int[aLen-1];
		
		firstPart[0] = A[0];
		secondPart[aLen-2] = A[aLen-1];
		
		// 각 파트의 합을 한번에 계싼
		for (int i=1; i<aLen-1; i++) {
			firstPart[i] = firstPart[i-1] + A[i];
			secondPart[aLen-i-2] = secondPart[aLen-i-1] + A[aLen-i-1];
		}
		
		// 이렇게 해주면 아래 for문을 돌지 않아서 오류는 안나는데 코딜리티에선 오류난다고 함 ㅡㅡ
		// int rst = Math.abs(firstPart[0]-secondPart[0]);
		
		int rst = Integer.MAX_VALUE;
		
		for (int i=0; i<firstPart.length; i++) {
			int absVal = Math.abs(firstPart[i]-secondPart[i]);
			if (rst > absVal) {
				rst = absVal;
			}
		}
		
		return rst;
	}
}
