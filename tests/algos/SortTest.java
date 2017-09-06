package algos;

import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-09-2017.
 */
public class SortTest {

    Sort bs = new Sort();
    @Test
    public void sanityTest() throws Exception {
//        int[] nums = {9,2,6,7,80,1};
        int[] nums = {90,90,60,70,8,1};
        bs.insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        int[] valid = {1,2,6,7,9,80};
        assertArrayEquals(valid,valid);
    }
}