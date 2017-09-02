package cci.arraysandstring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 22-08-2017.
 */
public class IsUniqueTest {

    IsUnique iu = new IsUnique();
    @Test
    public void testTrue() throws Exception {
        assertTrue(iu.checkUnique("helo"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(iu.checkUnique("hello"));
    }

    @Test
    public void testMyName() throws Exception {
        assertFalse(iu.checkUnique("jeffrey"));
    }
    @Test
    public void testMyalphnum() throws Exception {
        assertTrue(iu.checkUnique("abcdefghijk123456"));
    }
}