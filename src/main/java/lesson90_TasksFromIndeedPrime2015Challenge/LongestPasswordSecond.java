package lesson90_TasksFromIndeedPrime2015Challenge;

import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 * 패스워드 포맷에 3가지 조건이 있음
 *
 * - 오직 알파벳과 숫자만 가능 (a-z, A-Z, 0-9)
 * - 알파벳은 짝수 개
 * - 숫자는 홀수개
 *
 * N개의 char로 이루어진 string S.
 * S는 공백으로 나누거나 제거하여 단어로 나눌 수 있음.
 * 목표는 유효한 암로인 가장 긴 단어를 선택하는 것.
 * K 개의 공백이 있으면 단어는 K+1개 있음.
 *
 * 예를 들어 S가
 * test 5 a0A pass007 ?xy1
 *
 * 위와 같으면 가장 긴 암호는 pass007
 * test는 숫자가 없어서 유효하지 않음.
 *
 * 가장 긴 패스워드의 길이 리턴,
 * 유효한 패스워드가 없으면 -1 리턴
 *
 * N은 1~200
 *
 * 숫자 1개로만으로 구성 가능한 부분 놓침 (알파벳은 짝수개이므로 0개이어도 됨)
 *
 * 32 mins, 30% -> 70% -> 100%
 *
 * @author 이주현
 * @since 2019.08.16
 */
public class LongestPasswordSecond {
    public static void main(String[] args) {
        //String S = "test 5 a0A pass007 ?xy1";
        String S = "a";     // -1 리턴
        System.out.println(solution(S));
    }

    public static int solution(String S) {
        String[] arrS = S.split(" ");
        String condition = "^[0-9a-zA-Z]*$";

        //TreeSet<String> tSet = new TreeSet<>();
        int maxLength = Integer.MIN_VALUE;
        for (String s : arrS) {
            if (Pattern.matches(condition, s)) {
                int numCnt = 0;     // 숫자의 개수
                for (int i = 0; i < s.length(); i++) {
                    //System.out.println(s.charAt(i));
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        numCnt++;
                    }
                }
                int alphaCnt = s.length() - numCnt;

                if (numCnt % 2 == 1 && alphaCnt % 2 == 0) {
                    //tSet.add(s);
                    maxLength = Math.max(maxLength, s.length());
                }
            }
        }
        //System.out.println(tSet);
        return Math.max(maxLength, -1);
    }
}
