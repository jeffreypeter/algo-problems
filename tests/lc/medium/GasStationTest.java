package lc.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 13-09-2017.
 */
public class GasStationTest {
    GasStation gs = new GasStation();
    @Test
    public void canCompleteCircuit() throws Exception {
        int[] gas = {4};
        int[] station = {5};
        assertEquals(-1, gs.canCompleteCircuit(gas,station));
    }

}