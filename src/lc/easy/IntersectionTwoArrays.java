package lc.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeffr on 24-09-2017.
 */
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count = (nums1.length < nums2.length ? nums1.length:nums2.length );
        Set<Integer> res = new HashSet<>();
        int i1=0,i2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        while(i1 < nums1.length && i2 <nums2.length) {
            System.out.println(nums1[i1]+" "+nums2[i2]);
            if(nums1[i1] <nums2[i2] ) {
                System.out.println("i1");
                i1++;
            } else if(nums1[i1] > nums2[i2]) {
                System.out.println("i2");
                i2++;
            } else {
                System.out.println("i1i2");
                res.add(nums1[i1]);
                i1++;
                i2++;
            }
        }
        System.out.println(res.toString());
        int[] finalRes = new int[res.size()];
        int i=0;
        for(int val: res) {
            finalRes[i++] = val;
        }
        return finalRes;
    }
}
