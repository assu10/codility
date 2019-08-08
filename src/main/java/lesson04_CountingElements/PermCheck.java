package lesson04_CountingElements;

import java.util.Arrays;

/**
 * A 배열은 1~N 순열 (연속된 숫자)
 * A가 순열인지 검사
 * A가 순열이면 1 리턴, 아니면 0 리턴
 *
 * N은 1~100,000개의 요소
 * A 배열의 각 요소의 숫자 범위는 1~1,000,000,000
 *
 * 21분, 100%
 *
 * @author 이주현
 * @since 2019.08.08
 */
public class PermCheck {
    public static void main(String[] args) {
        //int[] A = {4,1,2,3};    // returns 1
        // int[] A = {4,2,3};    // returns 0
         //int[] A = {1};    // returns 0
         int[] A = {295570683, 115272380, 421981614, 376010625, 351244765, 87917055, 610063355, 158291076, 971010374, 727496078};    // returns 0
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // 오름차순으로 정렬
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
//        System.out.println(A[A.length-1]);
//        System.out.println(A.length);

        // 마지막 배열 요소와 길이 비교
        if (A[A.length-1] != A.length) {
            return 0;
        }

        for (int i=0; i<A.length; i++) {
            if (A[i] != i+1) {
                return 0;
            }
        }

        return 1;
    }
}
