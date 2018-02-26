package ci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class MakeDenominationTest {

    MakeDenomination m = new MakeDenomination();
    @Test
    public void test1() throws Exception {
        int[] coins = {1,10,25,50};
        long output = m.makeChange(coins,26);
        System.out.println(output);
//        assertEquals(output,);

    }
}