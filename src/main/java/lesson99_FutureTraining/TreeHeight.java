package lesson99_FutureTraining;

/**
 * 이진 트리는 비어있거나 하나의 정수값과 왼쪽 하위트리와 오른쪽 하위 트리, 2개이 추가 이진 트리로 구성된 노트
 *
 * 경로의 길이는 통과하는 포인터의 수
 *
 * 이진트리의 높이는 가능한 가장 긴 경로의 길이임.
 *
 * 하나로 구성된 트리는 높이 0
 * 빈 트리는 -1
 *
 * N개의 노드로 구성된 비어있지 않은 이진트리 T가 있을 때 높이 구하기.
 *
 * 속성 x는 루트에 포함 된 정수를 보유하고 속성 l과 r은 각각 이진 트리의 왼쪽과 오른쪽 서브 트리를 보유.
 *
 * 처음부터 참고함.
 *
 * 이진트리 길이구하는 문제
 * 재귀함수 사용
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class TreeHeight {
    static class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
    public static int solution(Tree T) {
        return calcHeight(T)-1;
    }
    private static int calcHeight(Tree t) {
        if (t == null) {
            return 0;
        }
        return Math.max(calcHeight(t.l), calcHeight(t.r))+1;
    }
}
