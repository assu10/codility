package lesson02;

import java.util.stream.IntStream;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
		
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		// 정렬
		//IntStream stream = IntStream.of(A).sorted();
		int[] arrInt = IntStream.of(A).sorted().toArray();
		
		// 출력
//		stream.forEach(i -> System.out.println(i));
		
		for (int i = 0; i<arrInt.length; i=i+2) {
			if (arrInt[i] != arrInt[i+1]) {
				return arrInt[i];
			}
		}
		
		return 0;
	}
}
