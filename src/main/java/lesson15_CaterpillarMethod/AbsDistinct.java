package lesson15_CaterpillarMethod;

import java.util.TreeSet;

/**
 * N개의 연속된 숫자로 이루어진 비어있지 않은 배열 A
 * 배열은 오름차순
 * 배열의 절대값 고유수는 배열 요소 사이의 고유 절대값의 수
 *
 *   A[0] = -5
 *   A[1] = -3
 *   A[2] = -1
 *   A[3] =  0
 *   A[4] =  3
 *   A[5] =  6
 *
 * 이 배열의 절대 고유수는 5
 * 배열안에 5개의 고유 절대값이 있기 때문.
 * 0,1,3,5,6
 *
 * 배열 A의 절대값 고유수를 리턴해서
 * 위 배열은 5를 리턴해야함
 *
 * N은 1~100,000
 * A의 각 요소 정수의 범위는 -2,147,483,648~2,147,483,647
 * 배열 A는 오름차순
 *
 * 14mins, 100%
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class AbsDistinct {
    public static void main(String[] args) {
        //int[] A = {-5,-3,-1,0,3,6};
        int[] A = {1};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        TreeSet<Integer> tSet = new TreeSet<>();
        for (int n : A) {
            tSet.add(Math.abs(n));
        }

        return tSet.size();
    }
}
