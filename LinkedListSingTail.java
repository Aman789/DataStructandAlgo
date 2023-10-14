public class LinkedListSingTail {

    int size = 0;
    Node head;
    Node tail;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }



    }

    public int gitfirst() {
        return head.data;
    }
    public int getlast(){
        return tail.data;
    }

}
