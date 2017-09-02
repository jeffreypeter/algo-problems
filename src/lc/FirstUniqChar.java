package lc;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        int result = -1;
        for(int i=0;i<s.length();i++) {
            int asc = s.charAt(i);
            map[asc]++;
        }
        System.out.println(Arrays.toString(map));
//        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            int asc = s.charAt(i);
            if(map[asc] == 1) {
                result = i;
                break;
            }
        }
        return  result;
    }
}
