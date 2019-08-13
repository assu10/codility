package lesson01_Iterations;


/**
 * 양의 정수 N으로 이루어진 이진갭은 N의 이진표현에서 양쪽 끝에 1로 둘러싸인 연속적인 0의 최대 시퀀스
 *
 * 숫자 9 - 1001 : 2리턴
 * 529 - 1000010001 : 4리턴
 * 20 - 10100 : 1리턴
 * 15 - 1111 : 0리턴
 * 32 - 100000 : 0 리턴
 * 1041 - 10000010001 : 5 리턴
 * 32 - 100000 : 0 리턴
 *
 * N은 1~2,147,483,647
 *
 * 38 min, 100%
 * 숫자를 이진수로 변경하는 법 Integer.toBinaryString(N)
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class BinaryGapSecond {
    public static void main(String[] args) {
//        int N = 9;      // 2
//        int N = 529;        // 4
//        int N = 20;     // 1
//        int N = 15;     // 0
//        int N = 32;   // 0
        int N = 1041;   // 5
        System.out.println(solution(N));
    }
    public static int solution(int N) {
        char[] arrBinary = Integer.toBinaryString(N).toCharArray();

        int binaryGap = 0;
        int startIdx = -1;
        for (int i=0; i<arrBinary.length; i++) {
            if (startIdx == -1) {
                startIdx = i;
            }
            if (startIdx != -1 && arrBinary[i] == '1') {
                binaryGap = Math.max(i-startIdx, binaryGap);
                startIdx = i;
            }
        }

        return binaryGap-1 > 0 ? binaryGap-1 : 0;
    }
}
