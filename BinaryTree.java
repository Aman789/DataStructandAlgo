import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    static class Node {
        int val;
        Node left = null;
        Node right = null;

        public Node(int data) {
            val = data;
        }
    }

    public void insertByValue(int val) {
        if (root == null) {
            root = new Node(val);
        } else {

            insert(root, val);
        }
    }

    public void insert(Node node, int val) {
        if (val <= node.val) {
            if (node.left != null) {
                insert(node.left, val);
            } else {
                node.left = new Node(val);
            }
        } else {
            if (node.right != null) {
                insert(node.right, val);
            } else {
                node.right = new Node(val);
            }
        }
    }

    public boolean findElement(int val) {
        return find(root, val);
    }

    public boolean find(Node node, int val) {
        if (val <= node.val) {
            if (node.left == null) {
                if (val == node.val) {
                    return true;
                } else {
                    return false;
                }
            } else {
                find(node.left, val);
            }
        }
        if (val > node.val) {
            if (node.right == null) {
                if (val == node.val) {
                    return true;
                } else {
                    return false;
                }
            } else {
                find(node.right, val);
            }

        }
        return false;
    }

    public int findMinValue() {
        Node curr = root;

        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.val;

    }

    public int findMaxValue() {
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public Node findMax(Node node) {
        if (node.right == null) {
            return node;
        } else {
            findMax(node.right);
        }
        return node;
    }

    public void bfsearch(){
        Queue<Node> bfs = new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            Node rm = bfs.remove();
            System.out.println(rm.val);
            if (rm.left != null){
                bfs.add(rm.left);
            }
            if (rm.right != null){
                bfs.add(rm.right);
            }
            
        }
    }

}
