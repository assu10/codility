package lesson02_Arrays;

import java.util.HashSet;

public class OddOccurrencesInArraySecondModify {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int n : A) {
            if (hSet.contains(n)) {
                hSet.remove(n);
                continue;
            }
            hSet.add(n);
        }
        return hSet.toArray(new Integer[1])[0];
    }
}
