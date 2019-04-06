package lesson01;


import java.util.ArrayList;
import java.util.List;

/**
 * 10진수를 넣으면 2진수로 변환하여 1사이에 있는 0의 갯수 중 가장 큰 갯수 리턴
 *
 * Find longest sequence of zeros in binary representation of an integer.
 
 * 9(1001) - 2  /  529(1000010001) - 5  /  15(1111) - 0  /  32(100000) - 0
 *
 * 100%
 *
 * @since 2019.04.05
 */
public class BinaryGap {
    public static void main(String[] args) {
//        int N = 9;      // 1001
        int N = 32;      // 1001
        System.out.println(solution(N));
    }
    
    public static int solution(int N) {
        int rst = 0;        // 결과값
        
        String biStr = Integer.toBinaryString(N);   // 1001
        //System.out.println(biStr);
    
        int cntZero = countStr(biStr, "0");
        int cntOne = countStr(biStr, "1");
        
        // 1의 개수가 1개 이하이거나, 0의 개수가 0이면 biGap은 zero
        if (cntOne <= 1 || cntZero == 0) {
            return rst;
        }
        
        // 1의 위치 저장
        int fromIdx = -1;
        List<Integer> oneIdxs = new ArrayList<>();
        while ((fromIdx = biStr.indexOf("1", fromIdx + 1)) >= 0) {
            oneIdxs.add(fromIdx);
        }
    
        // biGap 구하기
        for (int i=0; i<oneIdxs.size()-1; i++) {
            int tmpBiGap = oneIdxs.get(i+1)-oneIdxs.get(i)-1;
            if (rst < tmpBiGap) {
                rst = tmpBiGap;
            }
        }
        
        return rst;
    }
    
    /**
     * 문자열에 특정 문자열의 갯수 리턴
     * @param str 문자열
     * @param comp 특정 문자열
     * @return 특정 문자열의 갯수
     */
    public static int countStr(String str, String comp) {
        int cnt = 0;
        int fromIdx = -1;
        while ((fromIdx = str.indexOf(comp, fromIdx + 1)) >= 0) {
            cnt++;
        }
        return cnt;
    }
}
