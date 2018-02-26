package algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeffr on 17-11-2017.
 */
public class BinarySearchTreeTest {
    BinarySearchTree bst = new BinarySearchTree();
    int array[] = {5, 3, 9, 7, 1, 4, 0, 12, 11, 13, 15, 6, 2, 8, 10, 14};
    @Test
    public void testPrint() throws Exception {
        for(int value:array) {
            bst.insert(value);
        }
        System.out.println("Testing Print:");
        bst.print();
    }

    @Test
    public void testContains() throws Exception {
        for(int value:array) {
            bst.insert(value);
        }
        bst.contains(5);
        bst.contains(15);
        bst.contains(55);
    }

    @Test
    public void testSize() throws Exception {
        System.out.println("BST Size::");
        for(int value:array) {
            bst.insert(value);
        }
        System.out.println(bst.size());
    }

    @Test
    public void testSmallestLargest() throws Exception {
        for(int value:array) {
            bst.insert(value);
        }
        System.out.println("BST Smallest:: "+bst.smallest());
        System.out.println("BST Largest:: "+bst.largest());
    }

    @Test
    public void testGreaterSumTree() throws Exception {
        for(int value:array) {
            bst.insert(value);
        }
        System.out.println("GreaterSumTree");
        bst.greaterSumTree();
    }
}