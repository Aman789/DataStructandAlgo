public class LinkedListSing {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
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

    public static void printList(LinkedListSing list) {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

}
