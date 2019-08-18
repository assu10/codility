package lesson07_StacksandQueues;

import java.util.Stack;

public class FishSecondModify {
    public static void main (String[]args){
        int[] A = {4,3,2,1,5};      // 2
        int[] B = {0,1,0,0,0};
//        int[] A = {1};
//        int[] B = {1};
        System.out.println(solution(A, B));
    }
    public static int solution ( int[] A, int[] B) {
        Stack<Integer> downStack = new Stack<>();
        int aliveFishNum = 0;

        for (int i=0; i<A.length; i++) {
            if (B[i] == 0) {        // 0 up <-
                aliveFishNum++;

                if (downStack.isEmpty()) {
                    continue;
                }

                while (!downStack.isEmpty()) {
                    aliveFishNum--;
                    if (downStack.peek() > A[i]) {
                        break;
                    } else {
                        downStack.pop();
                    }
                }
            } else {                // 1 down ->
                // down 일 경우 stack push
                aliveFishNum++;
                downStack.push(A[i]);
            }
        }
        return aliveFishNum;
    }
}
