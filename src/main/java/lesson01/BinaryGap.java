package lesson01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {
    public static void main(String[] args) {
        int N = 15;
        String biStr = Integer.toBinaryString(N);

        int biOneLen = 0;
        int biZeroLen = 0;

        Pattern oneP = Pattern.compile("1");
        Pattern zeroP = Pattern.compile("0");
        Matcher oneM = oneP.matcher(biStr);
        Matcher zeroM = zeroP.matcher(biStr);

        // 0의 갯수
        while (oneM.find()) {
            biOneLen++;
        }

        // 1의 갯수
        while (zeroM.find()) {
            biZeroLen++;
        }

        // 1이 1개 이하이거나 0이 없으면 "0" 리턴
        if (biOneLen < 2 || biZeroLen == 0) {
            System.out.println("0");
        } else {
            String[] biArr = biStr.split("1");
            int biGap = 0;
            // 1로 split한 배열의 수만큼 돌면서 0의 갯수 카운트
            for (int i=0; i<biArr[i].length(); i++) {
                if (biGap < biArr[i].length()) {
                    biGap = biArr[i].length();
                }
            }
            System.out.println(biGap);
        }
    }
}
