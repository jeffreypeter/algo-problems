package hr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class ArmstrongNumberTest {

    ArmstrongNumber an = new ArmstrongNumber();
    @Test
    public void testF1() throws Exception {
        int n = 325;
        assertEquals(false,an.isArmstrongNumber(n));
    }
    @Test
    public void testS1() throws Exception {
        int n = 1;
        assertEquals(true,an.isArmstrongNumber(n));
    }
    @Test
    public void testS2() throws Exception {
        int n =0;
        assertEquals(true,an.isArmstrongNumber(n));
    }
}