package lesson90_TasksFromIndeedPrime2015Challenge;

import java.util.regex.Pattern;

public class LongestPasswordSecondModify {
    public static void main(String[] args) {
        String S = "test 5 a0A pass007 ?xy1";
        //String S = "a";     // -1 리턴
        System.out.println(solution(S));
    }

    public static int solution(String S) {
        String[] arrS = S.split(" ");
        String condition = "^[0-9a-zA-Z]*$";

        //TreeSet<String> tSet = new TreeSet<>();
        int maxLength = Integer.MIN_VALUE;
        for (String s : arrS) {
            if (Pattern.matches(condition, s)) {
                int numCnt = s.length() - s.replaceAll("[0-9]", "").length();     // 숫자의 개수
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
