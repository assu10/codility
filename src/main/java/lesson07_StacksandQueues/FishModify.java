package lesson07_StacksandQueues;

import java.util.Stack;

public class FishModify {
	public static void main(String[] args) {
		int[] A = {4,3,2,1,5,6,8};
		int[] B = {0,1,0,0,0,1,0};
//		int[] A = {4};
//		int[] B = {1};
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B) {
		int aliveCnt = 0;
		// B가 1인 요소 담을 스택
		Stack<Integer> downFishes = new Stack<>();
		
		for (int i=0; i<A.length; i++) {
			if (B[i] == 0) {        // up fish
				aliveCnt++;
				
				if (downFishes.isEmpty()) {
					continue;
				}
				
				// peek() : 스택에서 top이 가리키는 데이터 읽기, top의 변화는 없음
				int downFish = downFishes.peek();
				while(true) {
					aliveCnt--;
					if (A[downFish] < A[i]) {
						downFishes.pop();
						if (downFishes.isEmpty()) {
							break;
						}
						downFish = downFishes.peek();
					} else {
						break;
					}
				}
			} else {        // down fish
				downFishes.add(i);
				aliveCnt++;
			}
			
		}
		return aliveCnt;
	}
}
