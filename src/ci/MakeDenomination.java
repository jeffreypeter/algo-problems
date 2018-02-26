package ci;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffr on 02-10-2017.
 */
public class MakeDenomination {
    public long makeChange(int[] coins, int money) {
        return makeChange(coins,money,0,new HashMap<>(),new ArrayList<>());
    }
    public long makeChange (int[] coins, int money, int index, HashMap<String, Long> memo, ArrayList<Integer> way) {
        if(money ==0 ) {
            return 1;
        }
        if (index >= coins.length) {
            return 0;
        }
        String key = money + "-" + index;

        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        int amountWithCoin = 0;
        long ways = 0;
        while (amountWithCoin <= money) {
            int remaining = money - amountWithCoin;

            long status = makeChange(coins,remaining,index+1,memo, way);

            ways += status;
            amountWithCoin += coins[index];
        }
        memo.put(key,ways);
        return ways;
    }
}
