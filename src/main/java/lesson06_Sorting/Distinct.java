package lesson06_Sorting;

import java.util.HashSet;

/**
 * N개의 정수로 이루어진 배열 A
 * 배열 A안의 고유수의 개수 리턴
 *
 *  A[0] = 2    A[1] = 1    A[2] = 1
 *  A[3] = 2    A[4] = 3    A[5] = 1
 *
 * 위 배열은 3 리턴 (1,2,3)
 *
 * N은 0~100,000
 * A 각 요소 숫자의 범위는 -1,000,000 ~ 1,000,000
 *
 * 10mins, 100%
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class Distinct {
    public static void main(String[] args) {
        int[] A = {2,1,1,2,3,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hSet = new HashSet<>();
        for (int n : A) {
            hSet.add(n);
        }
        return hSet.size();
    }
}
