package lesson07_StacksandQueues;

import java.util.Stack;

/**
 * 상류,하류로 흐르는 물고기
 * A배열은 물고기의 크기
 * B배열은 물고기의 방향 (0은 왼쪽으로, 1은 오른쪽으로)
 * 서로 같은 방향은 만나지 않고, 다른 방향인 경우 크기가 더 큰 물고기가 작은 물고기 잡아먹음
 * 최종적으로 남는 물고기의 개수 리턴
 *
 * 43 mins, 37%
 *
 * 처음부터 해결방향 참고함.
 *
 * @author 이주현
 * @since 2019.08.18
 */
public class FishSecond {
    public static void main(String[] args) {
        int[] A = {4,3,2,1,5};
        int[] B = {1,1,0,0,1};
//        int[] A = {1};
//        int[] B = {1};
        System.out.println(solution(A, B));
    }
    public static int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        boolean isUp = false;       // 0 true, 1 false

        // 첫 번째 요소는 무조건 담음
        stack.push(A[0]);

        if (B[0] == 0) {
            isUp = true;
        }
        for (int i=1; i<A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
                continue;
            } else {
                int compareFish = stack.peek();
                if (isUp) {
                    if (B[i] == 0) {
                        stack.push(A[i]);
                    } else {
                        stack.push(A[i]);
                        isUp = false;
                    }
                } else {
                    if (B[i] == 1) {
                        stack.push(A[i]);
                    } else {
                        if (compareFish > A[i]) {
                            continue;
                        } else {
                            isUp = true;
                            stack.pop();
                            stack.push(A[i]);
                        }
                    }
                }
            }
        }
        return stack.size();
    }
}
