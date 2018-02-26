package lc.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 07-10-2017.
 */
public class LargestNumberTest {
    LargestNumber ln = new LargestNumber();
    @Test
    public void testCase1() throws Exception {
        int[] input ={3, 30, 34, 5, 9};
        ln.largestNumber(input);
    }@Test
    public void testCase2() throws Exception {
        int[] input ={1,2,3,1};
        ln.largestNumber(input);
    }
}