package lc.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 26-09-2017.
 */
public class FriendCirclesTest {
    FriendCircles fc = new FriendCircles();
    @Test
    public void initTest() throws Exception {
        int[][] M = {{0,0,0},{0,0,0},{0,0,0}};
        fc.findCircleNum(M);
    }
    @Test
    public void initTest1() throws Exception {
        int[][] M = {{}};
        fc.findCircleNum(M);
    }
    @Test
    public void testCase1() throws Exception {
        int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
        fc.findCircleNum(M);//1
    }
    @Test
    public void testCase2() throws Exception {
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
        fc.findCircleNum(M); //2
    }
    @Test
    public void failedTestCase1() throws Exception {
        int[][] M = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        fc.findCircleNum(M);//1
    }
}