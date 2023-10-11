public class LinkedListSing {

    Node head;
    int size = 0;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public boolean addFirst(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            // Node l = head;
            newNode.next = head;
        }
        head = newNode;
        size++;
        return true;
    }

    public boolean addLast(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        size++;
        return true;
    }

    public boolean delete() {
        this.head = null;
        size = 0;
        return true;
    }

    public boolean addAt(int idx, int item) throws Exception {
      
        if (idx > size - 1) {
            throw new Exception("index is greater than size of List");
        } else {

            for (int i = 0; i <= size; i++) {

            }

        }
        return true;
    }

    public boolean deleteAt(int index) {
        // Node newNode = new Node(2);
        int pos = 0;
        Node currNode = head;
        Node prev= currNode;
        while (currNode.next != null) {
            if (pos == index) {
                prev.next = currNode.next;
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                 pos++;
            }
           
        }
        
        size--;
        return true;
    }

    public int getFirst() throws Exception {
        if (head == null) {
            throw new Exception("No Elements exist in this list!");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        Node currNode = head;
        if (head == null) {
            throw new Exception("No Elements exist in this list!");
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        return currNode.data;
    }

    public static LinkedListSing insert(LinkedListSing list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }

    public int get(int idx) throws Exception {
        if (idx > size - 1) {
            throw new Exception("index is greater than size of List");
        }
        int position = 0;
        Node exiNode = head;

        while (position < idx) {
            exiNode = exiNode.next;
            position++;
        }

        return exiNode.data;
    }

    public String toString() {
        Node currNode = head;
        if (head == null) {
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        while (currNode.next != null) {
            ;
            s.append("'" + currNode.data + "', ");
            currNode = currNode.next;
        }
        s.append("'" + currNode.data + "']");

        return s.toString();
    }

}
