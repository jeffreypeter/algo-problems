package ci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class DirectionCoordinateSystemTest {

    DirectionCoordinateSystem dcs = new DirectionCoordinateSystem();
    @Test
    public void testcase1() throws Exception {
        int[] ref = {0,0};
        int[] pnt = {1,1};
        assertEquals("NE",dcs.findDirection(ref,pnt));
    }
    @Test
    public void testcase2() throws Exception {
        int[] ref = {0,0};
        int[] pnt = {-1,-1};
        assertEquals("SW",dcs.findDirection(ref,pnt));
    }
    @Test
    public void testcase3() throws Exception {
        int[] ref = {0,0};
        int[] pnt = {0,0};
        assertEquals("P",dcs.findDirection(ref,pnt));
    }
}