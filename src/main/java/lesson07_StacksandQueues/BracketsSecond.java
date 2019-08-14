package lesson07_StacksandQueues;

import java.util.Stack;

/**
 * N개의 char로 이루어진 string S.
 * 아래의 조건 중 하나라도 부합하면 1 리턴, 아니면 0 리턴
 *
 * S가 빈 문자열
 * ()[]{}
 *
 * N은 0~200,000
 * S는 오직 (, {, [, ], }, )로만 이루어져 있음.
 *
 * 24 mins, 100%
 *
 * @author 이주현
 * @since 2019.08.14
 */
public class BracketsSecond {
    public static void main(String[] args) {
        //String S = "{[()()]}";      // 1
        String S = "";      // 0

        System.out.println(solution(S));
    }
    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();
        if (S.length() == 0) {
            return 1;
        }
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '{' || S.charAt(i) == '[') {
                stack.push(S.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                char preChar = stack.pop();
                if (S.charAt(i) == ')' && preChar != '(') {
                    return 0;
                }
                if (S.charAt(i) == '}' && preChar != '{') {
                    return 0;
                }
                if (S.charAt(i) == ']' && preChar != '[') {
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
