package lesson03_TimeComplexity;

/**
 * 현재 X지점에 있고, Y보다 같거나 더 큰 지점으로 가길 원한다. 항상 고정된 D만큼 점프.
 * 최소 점프 횟수로 목표지점 도달 목표.
 *
 * 18분, 44% -> 100%
 * 정확도는 100%이나, 퍼포먼스를 위해선 반복문이 아니라 수학으로 접근했어야 함.
 *
 * @since 2019.04.07
 */
public class FrogJmp {
	public static void main(String[] args) {
		int X = 10;
		int Y = 99911321;
		int D = 7;
		
		System.out.println(solution(X, Y, D));
	}
	
	public static int solution(int X, int Y, int D) {
		// 점프 횟수
		int cntZmp = 0;
		
		while ((X + (cntZmp*D)) < Y) {
			cntZmp++;
		}
		
		return cntZmp;
	}
}
