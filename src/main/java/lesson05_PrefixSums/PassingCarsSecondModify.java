package lesson05_PrefixSums;

public class PassingCarsSecondModify {
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int toEast = 0;
        int passingSum = 0;

        for (int n : A) {
            if (n == 0) {
                toEast++;
            } else {
                passingSum += toEast;
                if (passingSum > 1000000000) {
                    return -1;
                }
            }
        }
        return passingSum;
    }
}
