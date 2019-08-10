package lesson07_StacksandQueues;

import java.util.Stack;

/**
 * 아래의 조건을 만족한다면 N char로 구성된 string S
 *
 * - S는 비어있다.
 * - U가 올바르게 중첩되어 있으면 S는 (U)
 * - V와 W가 올바르게 중첩되어 있으면 VW
 *
 * 예를 들어 S가 (()(())())는 올바른 중첩
 * ())는 올바르지 않은 중첩
 *
 * 올바르면 1, 아니면 0 리턴
 *
 * N은 0~1,000,000 범위 안의 정수
 * S는 ( 혹은 ) 으로만 구성되어 있음
 *
 * 18mins 62% -> 100%
 *
 * @author 이주현
 * @since 2019.08.10
 */
public class Nesting {
    public static void main(String[] args) {
        //String S = "(()(())())";        // returns 1
        //String S = ")(()(())())";        // returns 0
        //String S = "())(()(())())";        // returns 0
        String S = "()(()()(((()())(()()))";    // 0
        System.out.println(solution(S));
    }
    public static int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<S.length(); i++) {
            char chr = S.charAt(i);
            if (chr == '(') {
                stack.push(chr);
            } else {
                if (chr == ')' && stack.isEmpty()) {
                    return 0;
                }
                if (stack.pop() == '(' && chr != ')') {
                    return 0;
                }
            }
        }
        return 1;
    }
}
