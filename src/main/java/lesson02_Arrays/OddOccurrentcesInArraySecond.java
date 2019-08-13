package lesson02_Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * N개로 이루어진 비어있지 않은 배열 A
 * 홀수로만 구성되어 있다.
 * 하나만 빼고 다 2개씩 짝을 이루고 있음
 *
 * 짝을 이루고있지 않는 값 리턴
 *
 * N은 1~1,000,000
 * 배열 A의 값의 범위는 1~1,000,000,000
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 *
 * hashMap key값 가져오기 : for (Map.Entry<Integer, Integer> entry : hMap.entrySet())
 *
 * hashMap key값 가져오기
 *  for (Map.Entry<Integer, Integer> entry : hMap.entrySet())
 *
 * 첫 번째 방법도 100% 이지만 for을 두 번 돌리지 않고 한번에 하는 방법으로 개선
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class OddOccurrentcesInArraySecond {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,7,9,555};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int n : A) {
            if (hMap.containsKey(n)) {
                hMap.put(n, hMap.get(n)+1);
            } else {
                hMap.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue()%2 != 0) {
                return entry.getKey();
            }
        }

        return 0;
    }
}