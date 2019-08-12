package lesson15_CaterpillarMethod;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctSlicesModify {
    public static void main(String[] args) {
//        int M = 6;
//        int[] A = {3,4,5,5,2};  // 9
        int M = 3;
        int[] A = {0,0,1,2};  // 7
        System.out.println(solution(M, A));
    }

    public static int solution(int M, int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int lastIndex = -1;
        for (int i = 0;i < A.length; i++) {
            int preOccurIndex = map.containsKey(A[i]) ? map.get(A[i]) : -1;
            lastIndex = Math.max(preOccurIndex, lastIndex);
            result += i - lastIndex;
            if (result >= 1000000000) {
                return 1000000000;
            }
            map.put(A[i], i);
        }
        return result;
    }
}
