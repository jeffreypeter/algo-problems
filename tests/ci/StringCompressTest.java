package ci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class StringCompressTest {

    StringCompress sc = new StringCompress();
    @Test
    public void test1() throws Exception {
        char[] input = {'a','a','b','c','c','a'};
        assertEquals("a2b1c2a1",sc.compressString(input));
    }
}