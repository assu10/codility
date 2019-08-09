package lesson07_StacksandQueues;

import java.util.Stack;

/**
 * N개의 char로 이루어진 string S는 아래의 조건 중 하나라도 따를 때 적절히 중첩되었다고 보낟.
 *
 * S는 empty
 * S는 U가 적절히 중첩된 string일 때 "(U)" or "[U]" or "{U}"의 형태를 가짐
 * S는 V와 W가 적절히 중첩된 string일 때 "VW"의 형태를 가짐.
 *
 * 적절하면 1, 아니면 0 리턴
 *
 * N은 0~200,000
 * string S는 오직 "(", "{", "[", "]", "}" and/or ")".
 *
 * 0 -> 100%
 * @author 이주현
 * @since 2019.08.09
 */
public class BracketsModify {
    public static void main(String[] args) {
        String S = "{[()()]}";      // returns 1
        //String S = "([)()]";      // returns 0

        System.out.println(solution(S));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);

            // 여는 기호만 stack 적재
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                char lastC = stack.pop();
                if (c == ')' && lastC != '(') {
                    return 0;
                }
                if (c == '}' && lastC != '{') {
                    return 0;
                }
                if (c == ']' && lastC != '[') {
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
