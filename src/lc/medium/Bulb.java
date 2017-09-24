package lc.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by jeffr on 21-09-2017.
 */
public class Bulb {
    public int bulbSwitch(int n) {
        int count = 0;
        boolean[] bulb = new boolean[n];
        Arrays.fill(bulb,true);


        bulb[n-1]=!bulb[n-1];
        for(boolean value:bulb) {
            if(value) {
                count++;
            }
        }
        return count;
    }
}
