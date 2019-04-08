package lesson90_TasksFromIndeedPrime2015Challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * 영문, 숫자만 가능 a-z, A-Z, 0-9
 * 짝수개의 문자
 * 홀수개의 숫자
 *
 * 유효한 패스워드 중 가장 긴 패스워드의 길이 리턴
 * 없으면 -1 리턴
 *
 * 90min, 60% -> 100%
 *
 * @since 2019.04.08
 */
public class LongestPassword {
	public static void main(String[] args) {
		//String S = "test 5 a0A pass007 ?xy1";
		//String S = "5 a0A p0ass007 ?xy1";
		String S = "5";
		System.out.println(solution(S));
	}
	
	public static int solution(String S) {
		String[] arrPwd = S.split(" ");
		
		// 문자, 숫자만 포함하는 정규식
		String alNumRegExp = "^[a-zA-Z0-9]*$";
		
		// 문자, 숫자만 포함된 패스워드 담을 셋
		Set<String> alNumSet = new HashSet<>();
		
		// 문자, 숫자만 있는 단어 추출
		for (int i=0; i<arrPwd.length; i++) {
			if (arrPwd[i].matches(alNumRegExp)) {
				alNumSet.add(arrPwd[i]);
			}
		}
		
		int cntNum;     // 숫자 갯수
		int cntAlpha;   // 알파벳 갯수
		int cntAll;
		
		// 홀수개의 숫자와 짝수개의 문자를 담을 셋
		Set<String> alNumSet2 = new HashSet<>();
		
		for (String s : alNumSet) {
			cntAll = s.length();
			cntAlpha = s.replaceAll("[0-9]", "").length();
			cntNum = cntAll - cntAlpha;
			
			if ((cntAlpha%2 == 0) && (cntNum%2 == 1)) {
				alNumSet2.add(s);
			}
		}
		
		int longest = -1;
		for (String s : alNumSet2) {
			if (longest < s.length()) {
				longest = s.length();
			}
		}
		
		return longest;
	}
}
