package lesson99_FutureTraining;

/**
 * string S가 있을 때 양측이 반전이 되는 문자의 인덱스 리턴 (0부터 계산)
 * 없으면 -1 리턴
 *
 * 빈 문자열을 바꾸면 빈 문자열이 됨.
 *
 * 예를 들어
 * racecar - 3 리턴
 * x = 0 리턴
 *
 * S의 길이는 0~2,000,000
 *
 * 이건 3 리턴
 *
 * 17mins, 100%
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class StrSymmetryPoint {
    public static void main(String[] args) {
        //String S = "racecar"; // return 3
        //String S = "abcddcba";      // return -1
        //String S = "x"; // return 0
        String S = "";      // return -1
        //String S = "fdsegggv";      // return -1

        System.out.println(solution(S));
    }
    public static int solution(String S) {
        if (S.length() == 1) {
            return 0;
        } else if (S.length() % 2 == 0) {
            // 길이가 짝수면 대칭 불가
            return -1;
        }

        int symIdx = S.length()/2;

        for (int i = 0; i<symIdx; i++) {
            char leftChar = S.charAt(i);
            char rightChar = S.charAt(S.length()-i-1);

            if (leftChar != rightChar) {
                return -1;
            }
        }

        return symIdx;
    }
}
