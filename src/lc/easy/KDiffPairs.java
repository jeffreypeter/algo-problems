package lc.easy;

import java.util.HashMap;

/**
 * Created by jeffr on 24-08-2017.
 */
public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> checker = new HashMap<>();
        if(nums.length >= 1) {
            for(int i=0;i<nums.length;i++) {
                for(int j = i+1;j<nums.length;j++) {
                    if(nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
                        if(nums[i] < nums[j]) {
                            count+=checker(nums[i],nums[j],checker);
                        } else {
                            count+=checker(nums[j],nums[i],checker);
                        }
                    }
                }
            }
        }
        System.out.println(checker);
        return count;
    }
    public int checker(int s,int l,HashMap<Integer,Integer> checker) {
        if(checker.containsKey(s)) {
            if(checker.get(s) == l) {
                return 0;
            } else {
                return 1;
            }
        } else {
            checker.put(s,l);
            return 1;
        }

    }
}
