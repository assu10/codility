package lesson09_MaximumSliceProblem;

public class MaxSliceSumModify {
    public static void main(String[] args) {
        //int[] A = {3,-2,3};
        int[] A = {-1,3,1,-2,4,0,5};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int accumulationNum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int n : A) {
            accumulationNum = Math.max(n, n+accumulationNum);
            maxNum = Math.max(accumulationNum, maxNum);
        }
        return maxNum;
    }
}
