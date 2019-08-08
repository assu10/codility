package lesson04_CountingElements;

import java.util.Arrays;

/**
 * 1, 2, ... , X가 다 나오는 최소 인덱스 찾기 (없으면 -1 리턴)
 * 문제 자체가 잘 이해가 안감.. ;;
 * 0%
 *
 * @author 이주현
 * @since 2019.08.08
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        int X = 5;      // returns 6
        //int X = 3;      // returns 1
        //int[] A = {1,3,1,4,2,3,5,4};        // returns 6
        int[] A = {3};        // returns -1 -> 여기서 오류

        solution(X, A);
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        System.out.println(Arrays.binarySearch(A, X));
        return Arrays.binarySearch(A, X);
    }
}
