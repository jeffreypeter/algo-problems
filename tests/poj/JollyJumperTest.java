package poj;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class JollyJumperTest {
    JollyJumper jj = new JollyJumper();

    @Test
    public void testCaseS1() throws Exception {
        int[] lst = {1,4,2,3};
        assertEquals(jj.isJollyJumper(lst),true);
    }

    @Test
    public void testCaseF1() throws Exception {
        int[] lst = {1,4,2,-1,6};
        assertEquals(jj.isJollyJumper(lst),false);
    }

    @Test
    public void testCaseS2() throws Exception {
        int[] lst = {11,7,4,2,1,6};
        assertEquals(jj.isJollyJumper(lst),true);
    }

    @Test
    public void testCaseF3() throws Exception {
        int[] lst={4,1,4,2,3};
        assertEquals(jj.isJollyJumper(lst),false);

    }
    @Test
    public void testCaseF2() throws Exception {
        int[] lst = {5,1,4,2,-1,6};
        assertEquals(jj.isJollyJumper(lst),false);
    }
}