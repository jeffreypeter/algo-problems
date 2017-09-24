package lc.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffr on 20-09-2017.
 */
public class BinaryTreeRightSide {
    public void exploreRecursive(TreeNode node,int count, List<Integer> result) {


        if(node.right !=null) {
            System.out.println("RightNode::"+node.val);
            if(result.size() == count) {
                result.add(node.right.val);
                System.out.println("added-"+result.size());
            }
            exploreRecursive(node.right,++count,result);
            count--;
        }
        if(node.left != null) {
            System.out.println("LeftNode::"+node.val);
            if(result.size() == count) {

                result.add(node.left.val);
                System.out.println("added-"+result.size());
            }
            exploreRecursive(node.left, ++count,result);
            count--;
        }


    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null) {
            result.add(root.val);
            exploreRecursive(root,1,result);
        }
        return result;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }