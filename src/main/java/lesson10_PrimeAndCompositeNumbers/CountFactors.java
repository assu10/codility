package lesson10_PrimeAndCompositeNumbers;

/**
 * 만약 N = D * M과 같을 때 정수 M이 존재할 때 양의 정수 D는 양의 정수 N의 인수
 * 예를 들어 6은 24의 인수
 * (M=4, 24 = 6 * 4)
 *
 * N = D * M
 *
 * 양의 정수 N이 주어졌을 때 인수의 갯수 리턴
 * 예를 들어 N = 24인 경우 8 리턴
 * (1,2,3,4,6,8,12,24)
 *
 * N의 범위는 1 ~ 2,147,483,647
 *
 * 11mins, 71%, Performance 이슈
 *
 * O(N) 방식으로 풀면 시간초과 (Performance 이슈) -> O(sqrt(N))으로 풀어야 함
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class CountFactors {
    public static void main(String[] args) {
        int N = 1;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int fCnt = 0;
        for (int i=1; i<=N; i++) {
            if (N%i == 0) {
                fCnt++;
            }
        }
        return fCnt;
    }
}
