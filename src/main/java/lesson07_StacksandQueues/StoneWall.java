package lesson07_StacksandQueues;

import java.util.Stack;

/**
 * 벽은 N 미터의 높이이고, 두께는 고정되어 있다.
 * 각각의 위치마다 다른 높이를 가짐.
 * 벽의 높이는 N개의 정수로 이루어진 배열 H에 담겨있음.
 *
 * H[i]는 i부터 i+1까지의 벽높이
 * 특히, H[0]은 그 벽의 왼쪽 끝의 높이이고, h[n-1]은 그 벽의 오른쪽 끝의 높이
 *
 * 최소한의 벽돌로 벽을 지어라.
 *
 * 예를 들어 N=9인 배열 H가
 *   H[0] = 8    H[1] = 8    H[2] = 5
 *   H[3] = 7    H[4] = 9    H[5] = 8
 *   H[6] = 7    H[7] = 4    H[8] = 8
 *
 * 이면 7 리턴
 *
 * 접근 방향을 잡지 못해 처음부터 참고.
 *
 *  스택 이용.
 *  높이가 이전 벽돌보다 작으면 비교 대상 제거
 *  높이가 이전 벽돌보다 높으면 새로운 벽돌
 *  높이가 같으면 넘김 (=같은 벽돌)
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class StoneWall {
    public static void main(String[] args) {
        int[] H = {8,8,5,7,9,8,7,4,8};
        System.out.println(solution(H));
    }
    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int h : H) {
            while(!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == h) {
                continue;
            }
            if (stack.isEmpty() || stack.peek() < h) {
                stack.push(h);
                result++;
            }
        }
        return result;
    }
}
