package lesson02;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 자료구조 문제, 등장 횟수 측정의 부하를 줄이는 것이 핵심 (Hash사용 추천)
 */
public class OddOccurrencesInArray {
	public static void main(String[] args) {
		
		int[] A = {9,3,9,3,7};
		System.out.println(solution2(A));
	}
	
	public static int solution2(int[] A) {
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for (int i = 0; i < A.length; i++) {
			increaseCount(countMap, A[i]);
		}
		
		for (Integer key : countMap.keySet()) {
			if (countMap.get(key) % 2 != 0) {
				return key;
			}
		}
		
		return -1;
	}
	
	private static void increaseCount(Map<Integer, Integer> countMap, int targetNum) {
		Integer target = countMap.get(targetNum);
		
		if (target == null) {
			countMap.put(targetNum, 1);
		}
		else {
			countMap.put(targetNum, target + 1);
		}
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
