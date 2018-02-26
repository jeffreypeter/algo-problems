package poj;

import java.util.Arrays;

/**
 * Created by jeffr on 02-10-2017.
 * http://poj.org/problem?id=2575
 */
public class JollyJumper {
    public boolean isJollyJumper(int lst[]) {
        boolean result = true;
        boolean[] map = new boolean[lst.length];

        for(int i=1;i<lst.length;i++ ) {
            int diff = Math.abs(lst[i] - lst[i-1]);
            System.out.println("diff::"+diff);
            if(diff >= lst.length) {
                return false;
            } else {
                if(!map[diff]) {
                    map[diff] = true;
                } else {
                    //return false; // As this slot has been used already
                    result = false;
                    break;

                }
            }

        }
        for(int j=1;j<lst.length;j++) {
            if(!map[j]) {
//                return false;
                result = false;
                break;
            }
        }
        System.out.println(Arrays.toString(map));
        System.out.println("FinalResult::"+result);
        return result;
    }
}
