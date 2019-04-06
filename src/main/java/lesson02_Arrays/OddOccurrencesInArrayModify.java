package lesson02_Arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArrayModify {
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
}
