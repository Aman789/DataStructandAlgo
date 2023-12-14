import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    int height = 0;
    int lh = 0;
    int rh = 0;

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
    public Node findMinNode(Node node){
       
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public Node findMax(Node node) {
        if (node.right == null) {
            return node;
        } else {
            findMax(node.right);
        }
        return node;
    }

    public void bfsearch() {
        Queue<Node> bfs = new LinkedList<>();
        bfs.add(root);
        while (!bfs.isEmpty()) {
            Node rm = bfs.remove();
            System.out.println(rm.val);
            if (rm.left != null) {
                bfs.add(rm.left);
            }
            if (rm.right != null) {
                bfs.add(rm.right);
            }

        }
    }

    public void inOrderSearch() {
        Node curr = root;
        loopInorder(curr);
    }

    public void loopInorder(Node node) {
        if (node != null) {
            loopInorder(node.left);
            System.out.println(node.val);
            loopInorder(node.right);
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.println(node.val);
            loopInorder(node.left);
            loopInorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            loopInorder(node.left);
            loopInorder(node.right);
            System.out.println(node.val);
        }
    }

    public int findHeight() {
        Node curr = root;
        height = 0;
        lh = 0;
        rh = 0;
        return calcHeight(curr);
    }

    private int calcHeight(Node curr) {
        if (curr == null) {
            return -1;
        }
        return Math.max(calcHeight(curr.left), calcHeight(curr.right)) + 1;
    }

    public void deletby(int val) {
        Node curr = root;
        curr = deleteByVal(curr, val);
    }

    public Node deleteByVal(Node node, int val) {
        // no child
        if (node == null) {
            return null;
        }

        // one child
        if (val == node.val) {
            // if left and right is null
            if (node.left == null && node.right == null) {
                return null;
            }
            else if (node.left == null) {
                return node.right;
            }
            else if (node.right == null) {
                return node.left;
            }
            else {
                Node temp = findMinNode(node.right);
                node.val = temp.val;
                node.right= deleteByVal(node.right, temp.val);
            }
        }

        // two child


        if (val < node.val) {
            node.left = deleteByVal(node.left, val);
        }
        if (val > node.val) {
            node.right = deleteByVal(node.right, val);
        }
        return node;
    }

}
