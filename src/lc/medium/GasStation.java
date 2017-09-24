package lc.medium;

/**
 * Created by jeffr on 13-09-2017.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = -1;
        for(int i=0;i<gas.length;i++) {
            int tank =0;
            int j=i;
            int count=0;
            while(count<gas.length ) { // iter gas station
                tank+=gas[j]-cost[j];
                if(tank<0) {
                    break;
                }
                count++;
                j++;
                if(j==gas.length) {
                    j =0;
                }
            }
            if(tank >= 0 ) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
