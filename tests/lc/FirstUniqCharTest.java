package lc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 22-08-2017.
 */
public class FirstUniqCharTest {
    FirstUniqChar fuc = new FirstUniqChar();
    @Test
    public void firstUniqChar_basic0() throws Exception {
        assertEquals(0,fuc.firstUniqChar("leetcode"));
    }
    @Test
    public void firstUniqChar_basic2() throws Exception {
        assertEquals(2,fuc.firstUniqChar("loveleetcode"));
    }
}