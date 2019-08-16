package lesson02_Arrays;


/**
 * N개의 정수로 이루어진 배열 A.
 * 배열 로테이션은 각각의 요소가 오른쪽으로 한칸씩 이동하고 마지막 요소는 처음으로 가는 것을 의미함.
 *
 * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
 *
 * 목표는 배열 A을 K번 로테이션 시키는 것.
 *
 *  A = [3, 8, 9, 7, 6]
 *  K = 3
 * -> [9, 7, 6, 3, 8]
 *
 *     A = [1, 2, 3, 4]
 *     K = 4
 * -> [1, 2, 3, 4]
 *
 * N과 K는 0~100
 * A배열 각 요소의 범위는 -1,000~1,000
 *
 * 처음부터 참고함.
 * 수학적 접근 필요.
 *
 * 65 mins, 0%
 *
 * @author 이주현
 * @since 2019.08.16
 */
public class CyclicRotationSecond {
    public static void main(String[] args) {
        int[] A = {3,8,9,7,6};
//        int[] A = {0,0,0};
//        int[] A = {5};
//        int[] A = {1,2,3,4};
        int K = 1;
        solution(A, K);
    }
    public static int[] solution(int[] A, int K) {
        int[] tmpArr = new int[A.length];
        int tmpIdx = 0;
        for (int i=0; i<A.length; i++) {
            tmpIdx = (i+K)%A.length;
            tmpArr[tmpIdx] = A[i];
        }
        return tmpArr;
    }
}
