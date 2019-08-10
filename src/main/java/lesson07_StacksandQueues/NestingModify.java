package lesson07_StacksandQueues;

import java.util.Stack;

public class NestingModify {
    public static void main(String[] args) {

    }
    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<S.length(); i++) {
            char chr = S.charAt(i);
            if (chr == '(') {
                stack.push(chr);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
