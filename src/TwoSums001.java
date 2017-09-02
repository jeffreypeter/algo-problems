/**
 * Created by jeffr on 16-06-2017.
 */
public class TwoSums001 {
    public int[] twoSum(int[] nums, int target) {
        int startIndex = 0;
        int result[] = new int[2];
        while (startIndex < (nums.length -1) ) {
            for(int i = startIndex+1; i < nums.length; i++) {
                if((nums[startIndex] + nums[i] ) == target  ) {
                    result[0] = nums[startIndex];
                    result[1] = nums[i];
                    System.out.println(result[0]);
                    return result;
                }
            }
            startIndex++;
        }
        return result;
    }
    public static void main(String args[]) {
        TwoSums001 ts = new TwoSums001();
        int nums[] = {3,2,4};
        ts.twoSum(nums,6);
    }
}
