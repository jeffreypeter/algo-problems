package lc.medium;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by jeffr on 07-10-2017.
 */
public class LargestNumber {
    /*private boolean compare(String i,String j) {
        boolean flag = false;
        int length = (i.length() < j.length()) ? i.length():j.length();
        String ival = i.substring(0,length);
        String jval = j.substring(0,length);
        if(ival.compareTo(jval) > 0 ) {
            flag = true;
        } else if (ival.compareTo(jval) == 0 && i.length() < j.length()) {
            flag = true;
        }

        return flag;
    }*/
    private boolean compare(String i,String j) {
        boolean flag = false;

        if((i+j).compareTo(j+i) > 0) {
            flag = true;
        }
        System.out.println(i+j+" > " +j+i+" -- "+flag );
        return flag;
    }
    public String largestNumber(int[] nums) {

        for(int i = 1; i < nums.length;i++) {
//            int key = nums[i];
//            System.out.println(i);
            for(int j = i -1; j>=0 && !compare(Integer.toString(nums[i]),Integer.toString(nums[j])); j--) {
//                System.out.println(j);
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        StringBuilder sb = new StringBuilder();
        for(int i=nums.length-1;i >= 0; i-- ) {
            sb.append(nums[i]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
