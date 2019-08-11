package lesson10_PrimeAndCompositeNumbers;

/**
 * N개의 정수는 직사각형의 면적
 * 변의 길이 A, B인 직사각형의 면적은 A*B이고 둘레는 2*(A+B)
 *
 * 목표는 면적이 N이 되는 직사각형의 최소 둘레.
 *
 * 예를 들어 N=30이면 면적이 30이라는 소리
 * (1,30)의 둘레는 62
 * (2,15)의 둘레는 34
 * (3,10)의 둘레는 26
 * (5,6)의 둘레는 22
 *
 * 여기서는 22 리턴
 *
 * N은 1~1.000.000.000
 *
 * 공약수 구하는 문제
 *
 * 14mins, 100%
 *
 * @author 이주현
 * @since 2019.08.11
 */
public class MinPerimeterRectangle {
    public static void main(String[] args) {
        int N = 30;
        System.out.println(solution(N));
    }
    public static int solution(int N) {
        // write your code in Java SE 8
        int sqrtN = (int)Math.sqrt(N);
        //System.out.println(sqrtN);

        int B = 0;
        int peri = Integer.MAX_VALUE;
        for (int A=1; A<=sqrtN; A++) {
            if (N%A == 0) {
                B = N/A;
                peri = Math.min(2*(A+B), peri);
            }
        }
        return peri;
    }
}
