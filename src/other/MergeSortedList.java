package other;

import java.util.Arrays;

/**
 * Created by jeffr on 09-10-2017.
 */
public class MergeSortedList {
    public static void main(String args[]) {
        int[] a = {1,3,5,7,9,11};
        int[] b = {0,2,4,6,8};
        int[] result = new int[a.length + b.length];
        int ai= 0;
        int bi=0;
        int ri=0;
        while(ai < a.length && bi < b.length) {

            if(a[ai] <= b[bi]) {
                result[ri++] = a[ai++];
            } else if(b[bi] < a[ai]) {
                result[ri++] = b[bi++];
            }
            System.out.println("ai::"+ai+";bi::"+bi);
        }
        System.out.println(a.length +" "+ ai);
        System.arraycopy(a,ai,result,ri,a.length - ai);
        System.arraycopy(b,bi,result,ri,b.length - bi);
        System.out.println(Arrays.toString(result));
    }
}
