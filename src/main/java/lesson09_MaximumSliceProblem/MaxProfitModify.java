package lesson09_MaximumSliceProblem;

public class MaxProfitModify {
    public static void main(String[] args) {
        //int[] A = {23171,21011,21123,21366,21013,21367};        // returns 21367-21011 = 356
        int[] A = {80,10,20,30,50,20};        // returns 50-10=40
        //int[] A = {10,20,30,50,20};        // returns 50-10=40
        //int[] A = {5,4,3,2,1};        // returns 50-10=40
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length <= 1) {
            return 0;
        }

        int nMax = Integer.MIN_VALUE;
        int nMin = Integer.MAX_VALUE;

        for (int n : A) {
            nMin = Math.min(nMin, n);
            nMax = Math.max(nMax, n-nMin);
        }
        return nMax;
    }
}
