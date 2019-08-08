package lesson05_PrefixSums;

/**
 * 100%
 */
public class PassingCarsModify {
    public static void main(String[] args) {
        //int[] A = {0,1,0,1,1};  // returns 5
        int[] A = {0,1,0,0,1};  // returns 4
        //int[] A = {0,1};        // returns 1
        //int[] A = {1,0};        // returns 0

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int limitCarCnt = 1000000000;
        int passingCarCnt = 0;
        int toEast = 0;

        for (int i=0; i<A.length; i++) {
            if (A[i] == 0) {
                toEast++;
            } else {
                passingCarCnt += toEast;
                if (passingCarCnt > limitCarCnt) {
                    return -1;
                }
            }
        }

        return passingCarCnt;
    }
}
