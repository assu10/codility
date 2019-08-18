package lesson03_TimeComplexity;

import java.util.stream.IntStream;

/**
 * 두 구간으로 쪼갰을 때 구간별 합의 차가 가장 적은 곳의 차 리턴
 *
 * 18min, 84% -> 92% (반복문 조건 변경) -> 100% (스트림대신 반복문 사용)
 *
 * [-1000,1000] -> 2000 리턴해야 함.
 *
 */
public class TapeEquilibriumSecond {
    public static void main(String[] args) {
         int[] A = {3,1,2,4,3};       // 1
        //int[] A = {-1000,1000};      // 2000
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int totalSum = IntStream.of(A).sum();
        int frontSum = 0;
        int backSum = 0;
        int minimumDiff = Integer.MAX_VALUE;

//        for (int i=0; i<A.length; i++) {
        for (int i=0; i<A.length-1; i++) {
            frontSum += A[i];
            backSum = totalSum - frontSum;
            minimumDiff = Math.min(minimumDiff, Math.abs(frontSum-backSum));
        }
        return minimumDiff;
    }
}
