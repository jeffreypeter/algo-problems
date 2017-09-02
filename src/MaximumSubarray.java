import java.util.HashMap;

/**
 * Created by jeffr on 04-08-2017.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ss = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++) {
            
        }

        return 0;
    }
    public static  void main(String args[]) {
        int ip[] = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray ms = new MaximumSubarray();
        System.out.println(ms.maxSubArray(ip));
    }
}
