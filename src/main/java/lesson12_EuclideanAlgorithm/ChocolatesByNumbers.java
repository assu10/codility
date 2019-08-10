package lesson12_EuclideanAlgorithm;

/**
 * (즉, N개의 초콜렛으로 이루어진 원형에서 M씩 건너뛰면서 초콜릿 먹을 때 연속으로 몇 개까지 먹을 수 있는지 구할 것)
 * 정답은 N/최대공약수
 *
 * 두 개의 양의 정수 N, M
 * N은 원으로 배열된 초콜렛의 개수이고 0~N-1까지 번호가 매겨짐
 *
 * 초콜릿을 먹기 시작해서 먹으면 포장지만 남음
 *
 * 0부터 먹기 시작
 * 그리고 다음 원에서 M-1 초콜릿을 생략하고 다음 초콜릿을 먹음
 *
 * 정확하게는 만약 번호 X를 먹으면 다음에 번호 N%(X+M) (나눗셈의 나머지) 를 가진 초콜릿을 먹을 것이다.
 *
 * 이후 빈 포장을 발견하면 먹는 것을 중지
 *
 * 예를 들어 N=10, M=4이면 0,4,8,2,6 초콜릿을 먹게 된다.
 *
 * 목표는 먹을 초콜렛의 개수를 세는 것
 * 두 개의 양의 정수 N, M 주어졌을 대 먹을 초콜렛의 개수를 리턴
 * 10, 4가 주어지는 5 리턴
 *
 * N, M은 1~1,000,000,000
 *
 * 0% -> 100%
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class ChocolatesByNumbers {
    public static void main(String[] args) {
        int N = 15;
        int M = 4;
        System.out.println(solution(N, M));
    }

    public static int solution(int N, int M) {
        // write your code in Java SE 8
        int cnt = 0;
        int originalN = N;

        while (N%M != 0) {
            N = N % M;
            int tmp = N;
            N = M;
            M = tmp;
        }
        cnt = originalN/M;

        return cnt;
    }
}
