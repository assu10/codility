package lesson03_TimeComplexity;

public class PermMissingElemModify {
	public static void main(String[] args) {
		int[] A = {2,3,1,5};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		// 배열안의 요소는 1부터 시작(+1)하므로 잃어버린 요소(+1), 총 +2
		boolean[] checked = new boolean[A.length+2];
		
		for (int i=0; i<A.length; i++) {
			checked[A[i]] = true;
		}
		
		for (int i=1; i<checked.length; i++) {
			if (!checked[i]) {
				return i;
			}
		}
		return -1;
	}
}
