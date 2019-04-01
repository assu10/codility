package lesson01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {
    public static void main(String[] args) {
        int N = 15;
        String biStr = Integer.toBinaryString(N);
        int biStrSize = 0;
        int biStrSize1 = 0;
        Pattern p = Pattern.compile("1");
        Pattern p1 = Pattern.compile("0");
        Matcher m = p.matcher(biStr);
        Matcher m1 = p1.matcher(biStr);
        while (m.find()) {
            biStrSize++;
        }
        while (m1.find()) {
            biStrSize1++;
        }

        if (biStrSize < 2 || biStrSize1 == 0) {
            System.out.println("0");
        } else {
            String[] biArr = biStr.split("1");
            int biGap = 0;
            for (int i=0; i<biStrSize; i++) {
                if (biGap < biArr[i].length()) {
                    biGap = biArr[i].length();
                }
            }
            System.out.println(biGap);
        }
    }
}
