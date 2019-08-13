package lesson03_TimeComplexity;

/**
 * 개구리는 현재 위치 X에 있고 Y와 같거나 큰 위치로 이동하고 싶어 함.
 * 항상 고정된 거리인 D만큼만 점프함.
 *
 * 최소 점프 횟수 구할 것
 *
 *   X = 10
 *   Y = 85
 *   D = 30
 *
 * 인 경우 3 리턴
 * 10+30 = 40 + 30 = 70 + 30 = 100
 *
 * X, Y는 1~1,000,000,000
 * X <= Y
 *
 * 5mins, 100%
 *
 * 반복문이 아닌 수학적으로 접근
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class FrogJmpSecond {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(solution(X, Y, D));
    }
    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double)(Y-X)/D);
    }
}
