package lesson03_TimeComplexity;

public class TapeEquilibriumSecondModify {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};       // 1
        //int[] A = {-1000,1000};      // 2000
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
//int totalSum = IntStream.of(A).sum();
        int totalSum = 0;
        for (int n : A) {
            totalSum += n;
        }
        int frontSum = 0;
        int backSum = 0;
        int minimumDiff = Integer.MAX_VALUE;

        for (int i=0; i<A.length-1; i++) {
            frontSum += A[i];
            backSum = totalSum - frontSum;
            minimumDiff = Math.min(minimumDiff, Math.abs(frontSum-backSum));
        }
        return minimumDiff;
    }
}
