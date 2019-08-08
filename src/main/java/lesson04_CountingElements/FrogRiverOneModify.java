package lesson04_CountingElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneModify {
        public static void main(String[] args) {
            //int X = 5;      // returns 6
            int X = 3;      // returns 4
            int[] A = {1,3,1,4,2,3,5,4};        // returns 6
            //int[] A = {3};        // returns -1 -> 여기서 오류

            System.out.println(solution(X, A));
        }

        public static int solution(int X, int[] A) {
            // write your code in Java SE 8
            Set<Integer> marks = new HashSet<>();

            for (int i=0; i<A.length; i++) {
                if (A[i] <= X) {
                    marks.add(A[i]);

                    if (marks.size() == X) {
                        return i;
                    }
                }
            }
            return -1;
        }
}
