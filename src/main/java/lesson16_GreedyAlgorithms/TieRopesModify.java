package lesson16_GreedyAlgorithms;

public class TieRopesModify {
    public static void main(String[] args) {
        int K = 4;
        int[] A = {1,2,3,4,1,1,3};
        System.out.println((solution(K, A)));

    }
    public static int solution(int K, int[] A) {
        int sum = 0;
        int cnt = 0;

        for (int n : A) {
            sum += n;
            if (sum >= K) {
                sum = 0;
                cnt++;
            }
        }
        return cnt;
    }
}
