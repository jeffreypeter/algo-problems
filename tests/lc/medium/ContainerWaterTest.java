package lc.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 07-11-2017.
 */
public class ContainerWaterTest {
    ContainerWater cw = new ContainerWater();

    @Test
    public void test1() throws Exception {
        int[] input = {1,1};
        assertEquals(1,cw.maxArea(input));
    }
    @Test
    public void test2() throws Exception {
        int[] input = {1,2,5,3,6};
        assertEquals(10,cw.maxArea(input));
    }
}