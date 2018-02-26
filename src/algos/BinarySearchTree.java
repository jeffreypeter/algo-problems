package algos;

/**
 * Created by jeffr on 17-11-2017.
 */
public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    private class Integer {
        int value;
    }
    private class Node {
        int value;
        Node left,right;
        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    public void insert(int item) {
        root = insertHelper(item,root);
    }

    private Node insertHelper(int item,Node root) {

        if(root == null) {
            root =  new Node(item);
        } else {
            if(root.value > item) {
                root.left = insertHelper(item,root.left);
            } else {
                root.right = insertHelper(item, root.right);
            }
        }
        return root;
    }
    public void print() {
        printHelper(root);
    }
    private void printHelper(Node node) {
        if(node == null)
            return;
        printHelper(node.left);
        System.out.println(node.value);
        printHelper(node.right);
    }
    public boolean contains(int item) {
        System.out.println("isContains:: "+item);
        Node node = containsHelper(item,root);
        if(node == null) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
    private Node containsHelper(int item,Node node) {
        if(node == null || node.value == item) {
            return node;
        } else {
            if(node.value > item) {
                return containsHelper(item,node.left);
            } else {
                return containsHelper(item,node.right);
            }
        }
    }
    public int size() {
        return sizeHelper(root);
    }
    private int sizeHelper(Node node) {
        if(node == null) {
            return 0;
        } else {
            return (sizeHelper(node.left) + 1 + sizeHelper(node.right));
        }
    }
    public int smallest() {
        Node node = root;
        while(node.left != null) {
            node = node.left;
        }
        return node.value;
    }
    public int largest() {
        Node node = root;
        while(node.right != null) {
            node = node.right;
        }
        return node.value;
    }
    public void greaterSumTree() {
        Integer sum = new Integer();
        sum.value = 0;
        greaterSumTreeHelper(sum, root);
        print();
    }
    private void greaterSumTreeHelper(Integer sum,Node node) {

        if (node == null) {
            return;
        } else {
            greaterSumTreeHelper(sum,node.right);
            sum.value = sum.value + node.value;
            node.value = sum.value - node.value;
            greaterSumTreeHelper(sum,node.left);
        }

    }
}
