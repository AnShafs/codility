package binaryGap;

/**
 * Created by AnShafs on 05/20/2017.
 * Find longest sequence of zeros in binary representation of an integer.
 */

import java.util.*;

public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryStr = Integer.toBinaryString(N);
        char[] binaryArray = binaryStr.toCharArray();
        int gap = 0;
        ArrayList<Integer> gapList = new ArrayList<Integer>();
        for (int i = 0; i < binaryStr.length(); i++) {
            switch (binaryArray[i]) {
                case '1':
                    gapList.add(gap);
                    gap = 0;
                    break;
                case '0':
                    gap++;
                    break;
                default:
                    gap = 0;
                    break;
            }
        }
        return Collections.max(gapList);
    }
}
