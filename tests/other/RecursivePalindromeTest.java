package other;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class RecursivePalindromeTest {
    
    RecursivePalindrome rp = new RecursivePalindrome();

    @Test
    public void s1() throws Exception {
        int n = 1;
        assertEquals(0,rp.pathPalindrome(n));
    }
    @Test
    public void s2() throws Exception {
        int n = 35;
        assertEquals(1,rp.pathPalindrome(n));
    }
    @Test
    public void s3() throws Exception {
        int n = 100;
        assertEquals(1,rp.pathPalindrome(n));
    }
}