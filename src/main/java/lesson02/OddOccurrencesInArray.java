package lesson02;

import java.util.stream.IntStream;

/**
 * 홀수번 나타나는 요수 찾기
 *
 * 자료구조 문제, 등장 횟수 측정의 부하를 줄이는 것이 핵심 (Hash사용 추천)
 *
 * 33% -> 100%
 *
 * @since 2019.04.06
 */
public class OddOccurrencesInArray {
	public static void main(String[] args) {
		
		int[] A = {9,3,9,3,7};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		// 정렬
//		IntStream stream = IntStream.of(A).sorted();
//		stream.forEach(i -> System.out.println(i));
		int rst = 0;
		
		if (A.length == 1) {
			return A[0];
		}
		
		int[] arrInt = IntStream.of(A).sorted().toArray();
		
		for (int i = 0; i<arrInt.length/2; i=i+2) {
			if (arrInt[i] != arrInt[i+1]) {
				rst = arrInt[i];
			}
		}
		
		if (rst == 0) {
			rst = A[A.length-1];
		}
		
		return rst;
	}
}
