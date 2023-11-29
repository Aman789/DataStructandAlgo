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

        while (curr.left != null){
            curr = curr.left;
        }

        return curr.val;

    }

    public int findMaxValue() {               
        return findMax(root).val; 
    }

    public Node findMax(Node node){
        if (node.right !=null){
            findMax(node.right);
        }
        else{
            return node;
        }
        return node;
    }

}
