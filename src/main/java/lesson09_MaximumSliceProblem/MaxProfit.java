package lesson09_MaximumSliceProblem;

/**
 * N 개의 정수로 이루어진 배열 A
 * 연속된 N날들의 주식의 일가격 포함
 *
 * 단일 주가 P 일에 매수(사는 거)되어 Q일에 매각(파는 거)되면 이 거래의 이익은  A [Q]-A [P], A[Q] >= A[P]
 *
 *   A[0] = 23171
 *   A[1] = 21011
 *   A[2] = 21123
 *   A[3] = 21366
 *   A[4] = 21013
 *   A[5] = 21367
 *
 * 만일 0일에 매수해서 2일에 팔리면 21123-23171 = -2048, 즉 손실이 2048
 *
 * 여기서 최대 발생 가능한 이익은 1일 매수해서 5일 매각한 354이다.
 *
 * 최대 가능한 이익 리턴
 * 만일 어떠한 이익도 없으면 0 리턴
 *
 * N은 0~400,000
 * 배열 A의 각 요소의 범위는 0~200,000
 *
 * 36mins, 44%
 *
 * 최소값 저장 -> 인덱스가 높은 값들 중 루프돌면서 차액이 큰 값 저장
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class MaxProfit {
    public static void main(String[] args) {
        //int[] A = {23171,21011,21123,21366,21013,21367};        // returns 21367-21011 = 356
        //int[] A = {80,10,20,30,50,20};        // returns 50-10=40
        //int[] A = {10,20,30,50,20};        // returns 50-10=40
        int[] A = {5,4,3,2,1};        // returns 50-10=40
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }

        int maxValue = A[A.length-1];
        int minValue = A[A.length-1];

        for (int i=A.length-2; i>=0; i--) {
            if (maxValue < A[i] && i > 0) {
                maxValue = A[i];
            }
            if (minValue > A[i]) {
                minValue = A[i];
            }
        }

        int rtn = maxValue-minValue;
        if (rtn < 0) {
            rtn = 0;
        }
        return rtn;
    }
}
