package lc.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jeffr on 10-10-2017.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int result = 0 ;
        int l=0;
        int r = prices.length-1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        while(l<r) {
            min = (min < prices[l])? min : prices[l];
            max = (max > prices[r])? max : prices[r];

        }
        HashMap mp = new HashMap();
        List<Integer> employees = new ArrayList<>();
//        employees.g

        return result;
    }
}
