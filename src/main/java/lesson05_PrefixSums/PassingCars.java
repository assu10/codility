package lesson05_PrefixSums;


/**
 * N개로 이루어진 배열 A
 * A는 오직 0, 1로 이루어져있음
 * 0 : east (동쪽)
 * 1: west (서쪽)
 *
 * 목표는 지나가는 차를 세는 것
 * P는 동쪽으로 가는 차, Q는 서쪽으로 가는 차를 cars(P, Q) 처럼 표현함
 *
 * 0 ≤ P < Q < N
 *
 *   A[0] = 0
 *   A[1] = 1
 *   A[2] = 0
 *   A[3] = 1
 *   A[4] = 1
 *
 * (왼쪽 숫자는 0의 인덱스, 오른쪽은 1의 인덱스)
 * (0,1), (0,3), (0,4), (2,3), (2,4)
 *
 * 배열 A는 총 N개의 숫자로 이루어져 있음.
 * 지나가는 차의 숫자를 세어야 함.
 * 만일 지나가는 차가 1,000,000,000을 초과하면 -1 리턴
 *
 * 2,147,483,647
 *  64min, 40% -> 50%
 *
 * @author 이주현
 * @since 2019.08.08
 */
public class PassingCars {
    public static void main(String[] args) {
        //int[] A = {0,1,0,1,1};  // returns 5
        //int[] A = {0,1,0,0,1};  // returns 4
        //int[] A = {0,1};        // returns 1
        int[] A = {1,0};        // returns 0

        System.out.println(solution(A));
    }

    // 숫자 0 오른쪽의 1의 갯수를 모두 더해주면 됨.
    public static int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }

        int oneCnt = 0;

        // 1의 갯수
        for (int i=0; i<A.length; i++) {
            if (A[i] == 1) {
                oneCnt++;
            }
        }
        int passingCarsCnt = 0;

        for (int i=0; i<A.length; i++) {
            if (passingCarsCnt >= 1000000000) {
             return -1;
            }

            if (A[i] == 0) {
                passingCarsCnt += oneCnt;
                if (i < A.length-1 && A[i+1] != 0) {
                    oneCnt--;
                }
            }
        }
        return passingCarsCnt;
    }
}
