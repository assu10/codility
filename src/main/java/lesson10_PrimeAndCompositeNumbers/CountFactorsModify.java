package lesson10_PrimeAndCompositeNumbers;

public class CountFactorsModify {
    public static void main(String[] args) {
        int N = 24;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        // 제곱근
        int sqrtN = (int) Math.sqrt(N);
        int numFactor = 0;  // numbers of factors

        for (int i=1; i<=sqrtN; i++) {
            if (N % i == 0) {
                numFactor++;
            }
        }

        numFactor = numFactor * 2;

        if (sqrtN * sqrtN == N) {
            numFactor--;
        }
        return numFactor;
    }
}
