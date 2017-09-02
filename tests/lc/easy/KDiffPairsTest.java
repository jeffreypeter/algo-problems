package lc.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 24-08-2017.
 */
public class KDiffPairsTest {
    KDiffPairs kD = new KDiffPairs();

    @Test
    public void emptyInput() throws Exception {
        int[] input = {};
        int k = 3;
        assertEquals(kD.findPairs(input,k),0);
    }
    @Test
    public void testCase1() throws Exception {
        int[] input = {3, 1, 4, 1, 5};
        int k = 2;
        assertEquals(2,kD.findPairs(input,k));
    }
    @Test
    public void testCase2() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int k = 1;
        assertEquals(4,kD.findPairs(input,k));
    }
    @Test
    public void testCase3() throws Exception {
        int[] input = {1, 3, 1, 5, 4};
        int k = 0;
        assertEquals(1,kD.findPairs(input,k));
    }
}