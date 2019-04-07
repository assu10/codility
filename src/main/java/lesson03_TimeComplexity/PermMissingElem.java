package lesson03_TimeComplexity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 정수 [1~(N+1)]로 구성된 배열 중 빠진 요소 리턴
 *
 * 56분, 50%->100%
 * 정확도는 100%이나, 퍼포먼스를 안 나옴, 함수 사용 자제 필요.
 * 중첩 for문 지양
 *
 * @since 2019.04.07
 */
public class PermMissingElem {
	public static void main(String[] args) {
		//int[] A = {2,5,1,3};
		//int[] A = {2,4,1,3};
		int[] A = {2,3,1,5};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		// stream 재사용을 위해 배열로 저장 후 필요할 때마다 스트림 생성하여 사용
		List<Integer> aList = Arrays.stream(A).boxed().collect(Collectors.toList());
		
		// 해당 배열의 최대값
		int maxVal = aList.stream().max(Integer::compareTo).orElse(-1);
		
		// 배열의 길이와 최대값이 같으면 마지막 원소+1 리턴
		if (A.length == maxVal) {
			return maxVal+1;
		}
		
		// 해당 배열의 최소값
		int minVal = aList.stream().min(Integer::compareTo).orElse(-1);
		
		// 배열의 최소값이 1이 아니면 1 리턴
		if (minVal != 1) {
			return 1;
		}
		
		// 1부터 해당 배열의 최대 숫자의 범위를 가지는 리스트 생성 후 원래 리스트 요소 제거
		List<Integer> bList = IntStream.range(1, maxVal).boxed().collect(Collectors.toList());
		bList.removeAll(aList);
		
		return  bList.get(0);
	}
}

